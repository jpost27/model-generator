
package com.fanduel.modelgenerator.sportradar.nba.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "number",
    "sequence",
    "minutes",
    "field_goals_made",
    "field_goals_att",
    "field_goals_pct",
    "three_points_made",
    "three_points_att",
    "three_points_pct",
    "two_points_made",
    "two_points_att",
    "two_points_pct",
    "blocked_att",
    "free_throws_made",
    "free_throws_att",
    "free_throws_pct",
    "offensive_rebounds",
    "defensive_rebounds",
    "rebounds",
    "assists",
    "turnovers",
    "steals",
    "blocks",
    "assists_turnover_ratio",
    "personal_fouls",
    "offensive_fouls",
    "points",
    "fast_break_pts",
    "second_chance_pts",
    "team_turnovers",
    "points_off_turnovers",
    "team_rebounds",
    "flagrant_fouls",
    "player_tech_fouls",
    "team_tech_fouls",
    "coach_tech_fouls",
    "pls_min",
    "effective_fg_pct",
    "bench_points",
    "points_in_paint",
    "points_in_paint_att",
    "points_in_paint_made",
    "points_in_paint_pct",
    "true_shooting_att",
    "true_shooting_pct",
    "biggest_lead",
    "fouls_drawn",
    "efficiency",
    "efficiency_game_score",
    "defensive_rating",
    "offensive_rating",
    "points_against",
    "possessions",
    "opponent_possessions",
    "team_defensive_rebounds",
    "team_offensive_rebounds",
    "time_leading",
    "defensive_points_per_possession",
    "offensive_points_per_possession",
    "team_fouls",
    "total_rebounds",
    "total_fouls",
    "second_chance_att",
    "second_chance_made",
    "second_chance_pct",
    "fast_break_att",
    "fast_break_made",
    "fast_break_pct"
})
@Generated("jsonschema2pojo")
public class Period {

    @JsonProperty("type")
    public String type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("minutes")
    public String minutes;
    @JsonProperty("field_goals_made")
    public Integer fieldGoalsMade;
    @JsonProperty("field_goals_att")
    public Integer fieldGoalsAtt;
    @JsonProperty("field_goals_pct")
    public Double fieldGoalsPct;
    @JsonProperty("three_points_made")
    public Integer threePointsMade;
    @JsonProperty("three_points_att")
    public Integer threePointsAtt;
    @JsonProperty("three_points_pct")
    public Double threePointsPct;
    @JsonProperty("two_points_made")
    public Integer twoPointsMade;
    @JsonProperty("two_points_att")
    public Integer twoPointsAtt;
    @JsonProperty("two_points_pct")
    public Double twoPointsPct;
    @JsonProperty("blocked_att")
    public Integer blockedAtt;
    @JsonProperty("free_throws_made")
    public Integer freeThrowsMade;
    @JsonProperty("free_throws_att")
    public Integer freeThrowsAtt;
    @JsonProperty("free_throws_pct")
    public Double freeThrowsPct;
    @JsonProperty("offensive_rebounds")
    public Integer offensiveRebounds;
    @JsonProperty("defensive_rebounds")
    public Integer defensiveRebounds;
    @JsonProperty("rebounds")
    public Integer rebounds;
    @JsonProperty("assists")
    public Integer assists;
    @JsonProperty("turnovers")
    public Integer turnovers;
    @JsonProperty("steals")
    public Integer steals;
    @JsonProperty("blocks")
    public Integer blocks;
    @JsonProperty("assists_turnover_ratio")
    public Double assistsTurnoverRatio;
    @JsonProperty("personal_fouls")
    public Integer personalFouls;
    @JsonProperty("offensive_fouls")
    public Integer offensiveFouls;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("fast_break_pts")
    public Integer fastBreakPts;
    @JsonProperty("second_chance_pts")
    public Integer secondChancePts;
    @JsonProperty("team_turnovers")
    public Integer teamTurnovers;
    @JsonProperty("points_off_turnovers")
    public Integer pointsOffTurnovers;
    @JsonProperty("team_rebounds")
    public Integer teamRebounds;
    @JsonProperty("flagrant_fouls")
    public Integer flagrantFouls;
    @JsonProperty("player_tech_fouls")
    public Integer playerTechFouls;
    @JsonProperty("team_tech_fouls")
    public Integer teamTechFouls;
    @JsonProperty("coach_tech_fouls")
    public Integer coachTechFouls;
    @JsonProperty("pls_min")
    public Integer plsMin;
    @JsonProperty("effective_fg_pct")
    public Double effectiveFgPct;
    @JsonProperty("bench_points")
    public Integer benchPoints;
    @JsonProperty("points_in_paint")
    public Integer pointsInPaint;
    @JsonProperty("points_in_paint_att")
    public Integer pointsInPaintAtt;
    @JsonProperty("points_in_paint_made")
    public Integer pointsInPaintMade;
    @JsonProperty("points_in_paint_pct")
    public Double pointsInPaintPct;
    @JsonProperty("true_shooting_att")
    public Double trueShootingAtt;
    @JsonProperty("true_shooting_pct")
    public Double trueShootingPct;
    @JsonProperty("biggest_lead")
    public Integer biggestLead;
    @JsonProperty("fouls_drawn")
    public Integer foulsDrawn;
    @JsonProperty("efficiency")
    public Integer efficiency;
    @JsonProperty("efficiency_game_score")
    public Double efficiencyGameScore;
    @JsonProperty("defensive_rating")
    public Double defensiveRating;
    @JsonProperty("offensive_rating")
    public Double offensiveRating;
    @JsonProperty("points_against")
    public Integer pointsAgainst;
    @JsonProperty("possessions")
    public Double possessions;
    @JsonProperty("opponent_possessions")
    public Double opponentPossessions;
    @JsonProperty("team_defensive_rebounds")
    public Integer teamDefensiveRebounds;
    @JsonProperty("team_offensive_rebounds")
    public Integer teamOffensiveRebounds;
    @JsonProperty("time_leading")
    public String timeLeading;
    @JsonProperty("defensive_points_per_possession")
    public Double defensivePointsPerPossession;
    @JsonProperty("offensive_points_per_possession")
    public Double offensivePointsPerPossession;
    @JsonProperty("team_fouls")
    public Integer teamFouls;
    @JsonProperty("total_rebounds")
    public Integer totalRebounds;
    @JsonProperty("total_fouls")
    public Integer totalFouls;
    @JsonProperty("second_chance_att")
    public Integer secondChanceAtt;
    @JsonProperty("second_chance_made")
    public Integer secondChanceMade;
    @JsonProperty("second_chance_pct")
    public Double secondChancePct;
    @JsonProperty("fast_break_att")
    public Integer fastBreakAtt;
    @JsonProperty("fast_break_made")
    public Integer fastBreakMade;
    @JsonProperty("fast_break_pct")
    public Double fastBreakPct;

}
