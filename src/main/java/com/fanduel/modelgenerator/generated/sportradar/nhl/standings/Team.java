package com.fanduel.modelgenerator.generated.sportradar.nhl.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("records")
    private List<Record> records;

    @JsonProperty("penalty_killing_pct")
    private Double penaltyKillingPct;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("shootout_wins")
    private Integer shootoutWins;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("regulation_wins")
    private Integer regulationWins;

    @JsonProperty("calc_rank")
    private CalcRank calcRank;

    @JsonProperty("rank")
    private Rank rank;

    @JsonProperty("powerplay_goals")
    private Integer powerplayGoals;

    @JsonProperty("id")
    private String id;

    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("points_per_game")
    private Double pointsPerGame;

    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("powerplay_goals_against")
    private Integer powerplayGoalsAgainst;

    @JsonProperty("powerplays_against")
    private Integer powerplaysAgainst;

    @JsonProperty("streak")
    private Streak streak;

    @JsonProperty("win_pct")
    private Double winPct;

    @JsonProperty("powerplays")
    private Integer powerplays;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("points_pct")
    private Double pointsPct;

    @JsonProperty("goals_for")
    private Integer goalsFor;

    @JsonProperty("powerplay_pct")
    private Double powerplayPct;

    @JsonProperty("name")
    private String name;

    @JsonProperty("goal_diff")
    private Integer goalDiff;

    @JsonProperty("shootout_losses")
    private Integer shootoutLosses;
}
