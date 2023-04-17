package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class MlbHitData {
    @JsonProperty("hardness")
    private String hardness;

    @JsonProperty("coordinates")
    private Coordinates coordinates;

    @JsonProperty("trajectory")
    private String trajectory;
}
