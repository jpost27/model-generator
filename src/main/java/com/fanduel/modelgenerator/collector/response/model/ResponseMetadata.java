package com.fanduel.modelgenerator.collector.response.model;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import org.springframework.http.MediaType;

public record ResponseMetadata(
        RequestMetadata requestMetadata,
        String responseString,
        MediaType mediaType) {



}
