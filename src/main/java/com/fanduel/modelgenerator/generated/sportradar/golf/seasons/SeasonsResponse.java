package com.fanduel.modelgenerator.generated.sportradar.golf.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class SeasonsResponse {
    @JsonProperty("tours")
    private List<Tour> tours;

    public List<Tour> getTours() {
        return Optional.ofNullable(tours).orElse(Collections.emptyList());
    }
}
