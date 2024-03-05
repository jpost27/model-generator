package com.fanduel.modelgenerator.codegen;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseGenerationOptions {

    private String modelPrefix;

}
