package com.fanduel.modelgenerator.collector.request.model;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Set;

public record RequestParamMetadata(
        @NonNull String name,
        boolean required,
        @Nullable Set<String> validValues
) {
}
