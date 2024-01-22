package com.fanduel.modelgenerator.collector.request.model;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Set;

public record RequestMetadata(
        @NonNull String requestName,
        @NonNull HttpMethod httpMethod,
        @NonNull String exampleUrl, // Fully filled out, queryable url
        @Nullable String variableUrl, // URL with all variables noted
        @Nullable Set<RequestParamMetadata> parameters,
        @Nullable HttpHeaders headers
        ) {

}
