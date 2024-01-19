package com.fanduel.modelgenerator.generated.sportradar.golf.seasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
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
public class SeasonsResponse {
    @JsonProperty("tours")
    private List<Tour> tours;

    public List<Tour> getTours() {
        return Optional.ofNullable(tours).orElse(Collections.emptyList());
    }
}
