package com.fanduel.modelgenerator.generated.sportradar.nhl.gameanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class StartsByZone {
    @JsonProperty("defensive_pct")
    private Double defensivePct;

    @JsonProperty("offensive_pct")
    private Double offensivePct;

    @JsonProperty("neutral_pct")
    private Double neutralPct;
}
