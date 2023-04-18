package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersgoaltending;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Total {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("shutouts")
    private Integer shutouts;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;

    @JsonProperty("avg_goals_against")
    private Double avgGoalsAgainst;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;

    @JsonProperty("saves_pct")
    private Double savesPct;
}
