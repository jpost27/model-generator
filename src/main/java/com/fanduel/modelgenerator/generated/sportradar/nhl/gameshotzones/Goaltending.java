package com.fanduel.modelgenerator.generated.sportradar.nhl.gameshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Goaltending {
    @JsonProperty("danger_zones")
    private DangerZones dangerZones;

    @JsonProperty("shot_zones")
    private ShotZones shotZones;
}
