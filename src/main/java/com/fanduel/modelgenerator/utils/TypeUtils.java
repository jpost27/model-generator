package com.fanduel.modelgenerator.utils;

import org.springframework.core.ParameterizedTypeReference;
import reactor.core.publisher.Mono;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeUtils {

    public static <T> ParameterizedType parameterizedType(Class<T> clazz, Type... typeArguments) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return typeArguments;
            }

            @Override
            public Type getRawType() {
                return Mono.class;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        };
    }


}
