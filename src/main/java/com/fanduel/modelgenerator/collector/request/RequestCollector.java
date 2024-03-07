package com.fanduel.modelgenerator.collector.request;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;

import java.util.List;

public interface RequestCollector {

    List<RequestMetadata> getRequests();

}
