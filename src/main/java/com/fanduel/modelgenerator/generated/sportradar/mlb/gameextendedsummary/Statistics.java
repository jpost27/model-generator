package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistics {
    @JsonProperty("fielding")
    private Fielding fielding;

    @JsonProperty("pitching")
    private Pitching pitching;

    @JsonProperty("hitting")
    private Hitting hitting;
}
