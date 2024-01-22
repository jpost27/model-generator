package com.fanduel.modelgenerator.collector.response;

import com.fanduel.modelgenerator.cache.Cache;
import com.fanduel.modelgenerator.cache.CacheLoader;
import com.fanduel.modelgenerator.collector.request.model.RequestMetadata;
import com.fanduel.modelgenerator.collector.response.model.ResponseMetadata;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Slf4j
public class RequestExecutingResponseCollector implements ResponseCollector {

    private static final RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<ResponseMetadata> getResponses(@NonNull List<RequestMetadata> requestMetadataList) {
        log.info("Gathering " + requestMetadataList.size() +" responses via request execution.");
        // for each metadata, transform it into ResponseMetadata by executing the request and storing the response
        // any requests that fail should be logged and discarded for now
        List<ResponseMetadata> responseMetadataList = new ArrayList<>();
        for (RequestMetadata requestMetadata : requestMetadataList) {
            ResponseMetadata responseMetadata =
                    CacheLoader.loadOrFetch(
                            Cache.RESPONSE_LIST,
                            requestMetadata.exampleUrl(),
                            new TypeReference<ResponseMetadata>() {
                            },
                            (exampleUrl) -> requestMetadataToResponseMetadata(requestMetadata)
                                    .orElse(null));
            Optional.ofNullable(responseMetadata)
                    .ifPresent(responseMetadataList::add);
        }

        log.info("Finished gathering responses.");
        return responseMetadataList;
    }

    protected Optional<ResponseMetadata> requestMetadataToResponseMetadata(RequestMetadata requestMetadata) {
        ResponseEntity<String> jsonResponseEntity =
                restTemplate.getForEntity(requestMetadata.exampleUrl(), String.class);
        try {
            Thread.sleep(1050);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(jsonResponseEntity.getBody())
                .map(body -> new ResponseMetadata(
                        requestMetadata,
                        jsonResponseEntity.getBody(),
                        jsonResponseEntity.getHeaders()));
    }

}
