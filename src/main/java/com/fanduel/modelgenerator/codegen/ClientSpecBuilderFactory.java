package com.fanduel.modelgenerator.codegen;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.TypeVariableName;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ClientSpecBuilderFactory {

    private static final String WEB_CLIENT = "webClient";

    public static TypeSpec.Builder createTypeSpecForClient(
            @NonNull String clientName,
            @Nullable Collection<MethodSpec> methodSpecs
    ) {
        TypeSpec.Builder typeBuilder = TypeSpec
            .interfaceBuilder(clientName)
            .addModifiers(Modifier.PUBLIC)
            .addAnnotation(
                    AnnotationSpec
                            .builder(Generated.class)
                            .addMember("value", "\"fanduel-model-generator\"")
                            .build());
        Optional.ofNullable(methodSpecs)
                .ifPresent(methods -> methods.forEach(typeBuilder::addMethod));
        return typeBuilder;
    }

    public static TypeSpec.Builder createTypeSpecForClientImpl(
            @NonNull String clientName,
            @Nullable Collection<MethodSpec> methodSpecs
    ) {
        TypeSpec.Builder typeBuilder = TypeSpec
                .classBuilder(clientName + "Impl")
                .addSuperinterface(TypeVariableName.get(clientName))
                .addModifiers(Modifier.PUBLIC)
                .addField(FieldSpec.builder(WebClient.class, WEB_CLIENT)
                        .addModifiers(Modifier.PRIVATE, Modifier.FINAL)
                        .build())
                .addAnnotation(
                        AnnotationSpec
                                .builder(Generated.class)
                                .addMember("value", "\"fanduel-model-generator\"")
                                .build())
                .addAnnotation(
                        AnnotationSpec
                                .builder(RequiredArgsConstructor.class)
                                .build());
        Optional.ofNullable(methodSpecs)
                .ifPresent(methods -> methods.forEach(typeBuilder::addMethod));
        return typeBuilder;
    }

    public static CodeBlock.Builder createClientImplMethodCodeBlock(List<String> pathSegments, Class<?> methodReturnType) {
        return CodeBlock.builder()
                .add(
                        new StringBuilder()
                                .append("$1T uri = $2T.fromUriString(API_BASE_PATH)")
                                .append(System.lineSeparator())
                                .append(".pathSegment(" + String.join(", ", pathSegments.toArray(String[]::new)) + ")")
                                .append(System.lineSeparator())
                                .append(".queryParam(\"api_key\", API_KEY)")
                                .append(System.lineSeparator())
                                .append(".build();")
                                .append(System.lineSeparator())
                                .append("return fetch(uri.toUri(), ").append(methodReturnType.getSimpleName()).append(".class);")
                                .toString()
                        , UriComponents.class, UriComponentsBuilder.class);
    }

    public static MethodSpec.Builder createMethodSpecForClientFetchByClass() {
        TypeVariableName TypeTName = TypeVariableName.get("T");
        TypeVariableName classTypeTName = TypeVariableName.get("Class<T>", Class.class);
        return MethodSpec.methodBuilder("fetch")
                .addParameter(ParameterSpec.builder(URI.class, "uri").build())
                .addParameter(ParameterSpec.builder(classTypeTName, "returnType").build())
                .returns(TypeVariableName.get("Mono<T>", Mono.class))
                .addTypeVariable(TypeTName)
                .addCode("return fetch(uri, new $1T<>() {\n" +
                        "            @Override\n" +
                        "            public $2T getType() {\n" +
                        "                return super.getType();\n" +
                        "            }\n" +
                        "        });", ParameterizedTypeReference.class, Type.class);
    }

    public static MethodSpec.Builder createMethodSpecForClientFetchByParameterizedTypeReference() {
        TypeVariableName TypeTName = TypeVariableName.get("T");
        return MethodSpec.methodBuilder("fetch")
                .addParameter(ParameterSpec.builder(URI.class, "uri").build())
                .addParameter(ParameterSpec.builder(TypeVariableName.get("ParameterizedTypeReference<T>",
                        ParameterizedTypeReference.class), "returnType").build())
                .returns(TypeVariableName.get("Mono<T>", Mono.class))
                .addTypeVariable(TypeTName)
                .addCode("return " + WEB_CLIENT + ".get()\n" +
                        "                .uri(uri)\n" +
                        "                .retrieve()\n" +
                        "                .bodyToMono(returnType);");
    }

}
