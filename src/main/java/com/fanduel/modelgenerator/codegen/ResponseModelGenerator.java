package com.fanduel.modelgenerator.codegen;

import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import org.springframework.lang.NonNull;

import java.io.File;

public interface ResponseModelGenerator {

    void generateResponseModel(@NonNull ResponseMetadata responseMetadata);
}
