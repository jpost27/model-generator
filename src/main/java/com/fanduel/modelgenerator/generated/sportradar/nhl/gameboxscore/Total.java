package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Total {
    @JsonProperty("faceoffs_won")
    private Integer faceoffsWon;

    @JsonProperty("shooting_pct")
    private Double shootingPct;

    @JsonProperty("penalty_minutes")
    private Integer penaltyMinutes;

    @JsonProperty("plus_minus")
    private Integer plusMinus;

    @JsonProperty("penalties")
    private Integer penalties;

    @JsonProperty("overtime_goals")
    private Integer overtimeGoals;

    @JsonProperty("number_of_shifts")
    private Integer numberOfShifts;

    @JsonProperty("faceoffs")
    private Integer faceoffs;

    @JsonProperty("faceoff_win_pct")
    private Double faceoffWinPct;

    @JsonProperty("takeaways")
    private Integer takeaways;

    @JsonProperty("blocked_shots")
    private Integer blockedShots;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("faceoffs_lost")
    private Integer faceoffsLost;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;

    @JsonProperty("giveaways")
    private Integer giveaways;
}
