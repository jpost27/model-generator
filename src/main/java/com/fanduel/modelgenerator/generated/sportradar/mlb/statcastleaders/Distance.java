package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

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
public class Distance {
    @JsonProperty("average")
    private List<Average> average;

    @JsonProperty("max")
    private List<Max> max;

    public List<Average> getAverage() {
        return Optional.ofNullable(average).orElse(Collections.emptyList());
    }

    public List<Max> getMax() {
        return Optional.ofNullable(max).orElse(Collections.emptyList());
    }
}
