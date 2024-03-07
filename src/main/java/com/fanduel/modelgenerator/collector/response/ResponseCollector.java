package com.fanduel.modelgenerator.collector.response;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import org.springframework.lang.NonNull;

import java.util.List;

public interface ResponseCollector {

    List<ResponseMetadata> getResponses(@NonNull List<RequestMetadata> requestMetadataList);

}
