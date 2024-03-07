package com.fanduel.modelgenerator;

import com.fanduel.modelgenerator.codegen.ClientGeneratorImpl;
import com.fanduel.modelgenerator.codegen.JsonResponseModelGenerator;
import com.fanduel.modelgenerator.codegen.ResponseGenerationOptions;
import com.fanduel.modelgenerator.codegen.ResponseModelGenerator;
import com.fanduel.modelgenerator.collector.request.CommandLineSportRadarRequestCollector;
import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import com.fanduel.modelgenerator.collector.response.RequestExecutingResponseCollector;
import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import com.fanduel.modelgenerator.utils.StringUtils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static com.fanduel.modelgenerator.constants.Files.TEMP_DIRECTORY;

public class ModelGeneratorApplication {

    public static void main(String[] args) {
        List<RequestMetadata> requestMetadataList =
                new CommandLineSportRadarRequestCollector().getRequests();
        List<ResponseMetadata> responseMetadataList =
                        new RequestExecutingResponseCollector()
                                .getResponses(requestMetadataList);

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Enter a name for the folder to generate: ");
        Scanner scanner = new Scanner(System.in);
        final String apiName = String.join("",
                Arrays.stream(scanner.nextLine()
                .trim()
                .split("\\s+"))
                        .map(StringUtils::convertToPascalCase)
                .toList());
        ResponseGenerationOptions generationOptions = ResponseGenerationOptions.builder()
                .modelPrefix(apiName)
                .build();
        ResponseModelGenerator responseModelGenerator =
                new JsonResponseModelGenerator(TEMP_DIRECTORY,
                "com.fanduel.modelgenerator.generated." +
                        apiName.toLowerCase(Locale.ROOT),
                        generationOptions);
        responseMetadataList.forEach(responseModelGenerator::generateResponseModel);
        File outputDirectory = new File("temp");
        new ClientGeneratorImpl(apiName, "SportRadarClient", outputDirectory, "com.fanduel.modelgenerator.generated")
                .generateClient(responseMetadataList);
        scanner.close();
    }

}
