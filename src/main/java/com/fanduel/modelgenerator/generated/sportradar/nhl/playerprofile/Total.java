package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("games_scratched")
    private Integer gamesScratched;

    @JsonProperty("faceoff_win_pct")
    private Double faceoffWinPct;

    @JsonProperty("blocked_shots")
    private Integer blockedShots;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("total")
    private String total;

    @JsonProperty("shorthanded")
    private String shorthanded;

    @JsonProperty("penalties_match")
    private Integer penaltiesMatch;

    @JsonProperty("powerplay")
    private String powerplay;

    @JsonProperty("overtime_assists")
    private Integer overtimeAssists;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("emptynet_goals")
    private Integer emptynetGoals;

    @JsonProperty("shifts")
    private Integer shifts;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("penalties_major")
    private Integer penaltiesMajor;

    @JsonProperty("penalties_minor")
    private Integer penaltiesMinor;

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

    @JsonProperty("winning_goals")
    private Integer winningGoals;

    @JsonProperty("penalties_misconduct")
    private Integer penaltiesMisconduct;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("games_started")
    private Integer gamesStarted;

    @JsonProperty("overtime")
    private String overtime;

    @JsonProperty("overtime_shots")
    private Integer overtimeShots;

    @JsonProperty("evenstrength")
    private String evenstrength;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("faceoffs_lost")
    private Integer faceoffsLost;

    @JsonProperty("missed_shots")
    private Integer missedShots;

    @JsonProperty("giveaways")
    private Integer giveaways;
}
