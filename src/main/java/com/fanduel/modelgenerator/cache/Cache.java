package com.fanduel.modelgenerator.cache;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;

@Getter
@RequiredArgsConstructor
public enum Cache {

    RESPONSE_LIST(MediaType.APPLICATION_JSON),
    DOCUMENTATION_HTML(MediaType.TEXT_PLAIN),
    ;

    private final MediaType mediaType;
}
