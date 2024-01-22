package com.fanduel.modelgenerator;

import com.fanduel.modelgenerator.codegen.JsonResponseModelGenerator;
import com.fanduel.modelgenerator.codegen.ResponseModelGenerator;
import com.fanduel.modelgenerator.collector.request.CommandLineSportRadarRequestCollector;
import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import com.fanduel.modelgenerator.collector.response.RequestExecutingResponseCollector;
import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ModelGeneratorApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(ModelGeneratorApplication.class, args);
//    }
    private static final File tempDirectory = new File("temp");

    public static void main(String[] args) {
        List<RequestMetadata> requestMetadataList =
                new CommandLineSportRadarRequestCollector().getRequests();

        List<ResponseMetadata> responseMetadataList =
                        new RequestExecutingResponseCollector()
                                .getResponses(requestMetadataList);

        System.out.print("Enter a name for the folder to generate: ");
        Scanner scanner = new Scanner(System.in);
        final String folderName = scanner.nextLine();
        ResponseModelGenerator responseModelGenerator =
                new JsonResponseModelGenerator(tempDirectory,
                "com.fanduel.modelgenerator.generated." + folderName
                        .trim()
                        .replaceAll("\\s", "")
                        .toLowerCase(Locale.ROOT));
        responseMetadataList.forEach(responseModelGenerator::generateResponseModel);
        scanner.close();
    }

}
