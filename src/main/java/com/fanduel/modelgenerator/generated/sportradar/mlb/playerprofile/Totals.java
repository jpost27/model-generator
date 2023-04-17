package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Totals {
    @JsonProperty("statcast_metrics")
    private StatcastMetrics statcastMetrics;

    @JsonProperty("splits")
    private Splits splits;

    @JsonProperty("statistics")
    private Statistics statistics;
}
