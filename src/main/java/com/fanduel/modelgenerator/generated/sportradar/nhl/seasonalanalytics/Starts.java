package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Starts {
    @JsonProperty("defensive_zone_starts")
    private Double defensiveZoneStarts;

    @JsonProperty("neutral_zone_starts")
    private Double neutralZoneStarts;

    @JsonProperty("offensive_zone_starts")
    private Double offensiveZoneStarts;
}
