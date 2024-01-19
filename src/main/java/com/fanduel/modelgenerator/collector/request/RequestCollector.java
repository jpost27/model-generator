package com.fanduel.modelgenerator.collector.request;

import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;

import java.util.Collection;

public interface RequestCollector {

    Collection<RequestMetadata> collectRequests();

}
