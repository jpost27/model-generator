package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Shootout {
    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;
}
