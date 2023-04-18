package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LowRightPoint {
    @JsonProperty("shooting_pct")
    private Double shootingPct;

    @JsonProperty("shot_att")
    private Integer shotAtt;

    @JsonProperty("shots")
    private Double shots;

    @JsonProperty("blocked_att")
    private Double blockedAtt;

    @JsonProperty("goals")
    private Double goals;

    @JsonProperty("missed_shots")
    private Double missedShots;
}
