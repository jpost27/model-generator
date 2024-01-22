package com.fanduel.modelgenerator.collector.response.model;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import org.springframework.http.HttpHeaders;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public record ResponseMetadata(
        @NonNull RequestMetadata requestMetadata,
        @NonNull String responseString,
        @Nullable HttpHeaders responseHeaders) {



}
