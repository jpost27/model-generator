package com.fanduel.modelgenerator.generated.nbav8.dailyschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
