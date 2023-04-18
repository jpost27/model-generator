package com.fanduel.modelgenerator.generated.sportradar.nhl.gameshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DangerZones {
    @JsonProperty("danger_low")
    private DangerLow dangerLow;

    @JsonProperty("danger_high")
    private DangerHigh dangerHigh;

    @JsonProperty("danger_medium")
    private DangerMedium dangerMedium;
}
