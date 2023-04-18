package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesstatistics;

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

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("avg_goals_against")
    private Double avgGoalsAgainst;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("total")
    private String total;

    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("shifts")
    private Integer shifts;

    @JsonProperty("total_shots_against")
    private Integer totalShotsAgainst;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("faceoffs_won")
    private Integer faceoffsWon;

    @JsonProperty("shooting_pct")
    private Double shootingPct;

    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("plus_minus")
    private Integer plusMinus;

    @JsonProperty("faceoffs")
    private Integer faceoffs;

    @JsonProperty("takeaways")
    private Integer takeaways;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("powerplays")
    private Integer powerplays;

    @JsonProperty("winning_goals")
    private Integer winningGoals;

    @JsonProperty("saves_pct")
    private Double savesPct;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("games_started")
    private Integer gamesStarted;

    @JsonProperty("shutouts")
    private Integer shutouts;

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
