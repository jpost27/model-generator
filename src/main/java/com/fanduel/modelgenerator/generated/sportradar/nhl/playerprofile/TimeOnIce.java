package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TimeOnIce {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;
}
