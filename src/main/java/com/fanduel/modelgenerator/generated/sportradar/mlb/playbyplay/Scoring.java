package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Scoring {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("home")
    private Home home;
}
