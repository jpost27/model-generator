package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Location {
    @JsonProperty("lng")
    private String lng;

    @JsonProperty("lat")
    private String lat;

    public Optional<String> getLng() {
        return Optional.ofNullable(lng);
    }

    public Optional<String> getLat() {
        return Optional.ofNullable(lat);
    }
}
