package com.fanduel.modelgenerator.generated.sportradar.nhl.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Total {
    @JsonProperty("penalty_minutes")
    private Integer penaltyMinutes;

    @JsonProperty("penalties")
    private Integer penalties;

    @JsonProperty("number_of_shifts")
    private Integer numberOfShifts;

    @JsonProperty("faceoff_win_pct")
    private Double faceoffWinPct;

    @JsonProperty("blocked_shots")
    private Integer blockedShots;

    @JsonProperty("winning_goal")
    private Boolean winningGoal;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("total_shots_against")
    private Integer totalShotsAgainst;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("credit")
    private String credit;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("faceoffs_won")
    private Integer faceoffsWon;

    @JsonProperty("shooting_pct")
    private Double shootingPct;

    @JsonProperty("plus_minus")
    private Integer plusMinus;

    @JsonProperty("overtime_goals")
    private Integer overtimeGoals;

    @JsonProperty("faceoffs")
    private Integer faceoffs;

    @JsonProperty("takeaways")
    private Integer takeaways;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("powerplays")
    private Integer powerplays;

    @JsonProperty("saves_pct")
    private Double savesPct;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("team_penalty_minutes")
    private Integer teamPenaltyMinutes;

    @JsonProperty("total_goals_against")
    private Integer totalGoalsAgainst;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("team_penalties")
    private Integer teamPenalties;

    @JsonProperty("faceoffs_lost")
    private Integer faceoffsLost;

    @JsonProperty("missed_shots")
    private Integer missedShots;

    @JsonProperty("giveaways")
    private Integer giveaways;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;
}
