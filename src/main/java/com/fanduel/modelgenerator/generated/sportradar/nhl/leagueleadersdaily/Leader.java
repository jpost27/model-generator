package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersdaily;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Leader {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("average")
    private Double average;

    @JsonProperty("penalty_minutes")
    private Integer penaltyMinutes;

    @JsonProperty("plus_minus")
    private Integer plusMinus;

    @JsonProperty("save_pct")
    private Double savePct;

    @JsonProperty("minutes")
    private Integer minutes;

    @JsonProperty("shorthanded_goals")
    private Integer shorthandedGoals;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("shutouts")
    private Integer shutouts;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("powerplay_goals")
    private Integer powerplayGoals;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("game_winning_goals")
    private Integer gameWinningGoals;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;

    @JsonProperty("player")
    private Player player;

    @JsonProperty("goals")
    private Integer goals;
}
