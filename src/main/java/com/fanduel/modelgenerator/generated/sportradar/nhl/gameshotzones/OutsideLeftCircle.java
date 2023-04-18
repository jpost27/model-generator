package com.fanduel.modelgenerator.generated.sportradar.nhl.gameshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class OutsideLeftCircle {
    @JsonProperty("shooting_pct")
    private Double shootingPct;

    @JsonProperty("shot_att")
    private Integer shotAtt;

    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;

    @JsonProperty("saves_pct")
    private Double savesPct;
}
