package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Average {
    @JsonProperty("danger_zones")
    private DangerZones dangerZones;

    @JsonProperty("shot_zones")
    private ShotZones shotZones;
}
