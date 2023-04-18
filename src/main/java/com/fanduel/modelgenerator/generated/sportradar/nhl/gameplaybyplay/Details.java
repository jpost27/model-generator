package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Details {
    @JsonProperty("goal_zone")
    private String goalZone;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("distance")
    private Integer distance;

    @JsonProperty("penalty_type")
    private String penaltyType;

    @JsonProperty("shot_type")
    private String shotType;

    @JsonProperty("stoppage_type")
    private String stoppageType;

    @JsonProperty("penalty_code")
    private String penaltyCode;
}
