package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Splits {
    @JsonProperty("pitching")
    private Pitching pitching;

    @JsonProperty("hitting")
    private Hitting hitting;
}
