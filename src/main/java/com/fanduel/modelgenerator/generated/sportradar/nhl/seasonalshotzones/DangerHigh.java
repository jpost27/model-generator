package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DangerHigh {
    @JsonProperty("shooting_pct")
    private Double shootingPct;

    @JsonProperty("shot_att")
    private Integer shotAtt;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;
}
