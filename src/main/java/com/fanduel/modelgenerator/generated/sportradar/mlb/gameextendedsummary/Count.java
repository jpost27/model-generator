package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Count {
    @JsonProperty("outs")
    private Integer outs;

    @JsonProperty("balls")
    private Integer balls;

    @JsonProperty("strikes")
    private Integer strikes;

    @JsonProperty("pitch_count")
    private Integer pitchCount;
}
