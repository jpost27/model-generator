
package com.fanduel.modelgenerator.sportradar.nba.seasonalstatisticsseasontodate;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "games_played",
    "games_started",
    "minutes",
    "field_goals_made",
    "field_goals_att",
    "field_goals_pct",
    "two_points_made",
    "two_points_att",
    "two_points_pct",
    "three_points_made",
    "three_points_att",
    "three_points_pct",
    "blocked_att",
    "free_throws_made",
    "free_throws_att",
    "free_throws_pct",
    "offensive_rebounds",
    "defensive_rebounds",
    "rebounds",
    "assists",
    "turnovers",
    "assists_turnover_ratio",
    "steals",
    "blocks",
    "personal_fouls",
    "tech_fouls",
    "points",
    "flagrant_fouls",
    "ejections",
    "foulouts",
    "true_shooting_att",
    "true_shooting_pct",
    "efficiency",
    "points_off_turnovers",
    "points_in_paint",
    "points_in_paint_made",
    "points_in_paint_att",
    "points_in_paint_pct",
    "effective_fg_pct",
    "double_doubles",
    "triple_doubles",
    "fouls_drawn",
    "offensive_fouls",
    "fast_break_pts",
    "fast_break_att",
    "fast_break_made",
    "fast_break_pct",
    "coach_ejections",
    "second_chance_pct",
    "second_chance_pts",
    "second_chance_att",
    "second_chance_made",
    "minus",
    "plus",
    "coach_tech_fouls"
})
@Generated("jsonschema2pojo")
public class Total__2 {

    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("games_started")
    public Integer gamesStarted;
    @JsonProperty("minutes")
    public Double minutes;
    @JsonProperty("field_goals_made")
    public Integer fieldGoalsMade;
    @JsonProperty("field_goals_att")
    public Integer fieldGoalsAtt;
    @JsonProperty("field_goals_pct")
    public Double fieldGoalsPct;
    @JsonProperty("two_points_made")
    public Integer twoPointsMade;
    @JsonProperty("two_points_att")
    public Integer twoPointsAtt;
    @JsonProperty("two_points_pct")
    public Double twoPointsPct;
    @JsonProperty("three_points_made")
    public Integer threePointsMade;
    @JsonProperty("three_points_att")
    public Integer threePointsAtt;
    @JsonProperty("three_points_pct")
    public Double threePointsPct;
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
    @JsonProperty("assists_turnover_ratio")
    public Double assistsTurnoverRatio;
    @JsonProperty("steals")
    public Integer steals;
    @JsonProperty("blocks")
    public Integer blocks;
    @JsonProperty("personal_fouls")
    public Integer personalFouls;
    @JsonProperty("tech_fouls")
    public Integer techFouls;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("flagrant_fouls")
    public Integer flagrantFouls;
    @JsonProperty("ejections")
    public Integer ejections;
    @JsonProperty("foulouts")
    public Integer foulouts;
    @JsonProperty("true_shooting_att")
    public Double trueShootingAtt;
    @JsonProperty("true_shooting_pct")
    public Double trueShootingPct;
    @JsonProperty("efficiency")
    public Integer efficiency;
    @JsonProperty("points_off_turnovers")
    public Integer pointsOffTurnovers;
    @JsonProperty("points_in_paint")
    public Integer pointsInPaint;
    @JsonProperty("points_in_paint_made")
    public Integer pointsInPaintMade;
    @JsonProperty("points_in_paint_att")
    public Integer pointsInPaintAtt;
    @JsonProperty("points_in_paint_pct")
    public Double pointsInPaintPct;
    @JsonProperty("effective_fg_pct")
    public Double effectiveFgPct;
    @JsonProperty("double_doubles")
    public Integer doubleDoubles;
    @JsonProperty("triple_doubles")
    public Integer tripleDoubles;
    @JsonProperty("fouls_drawn")
    public Integer foulsDrawn;
    @JsonProperty("offensive_fouls")
    public Integer offensiveFouls;
    @JsonProperty("fast_break_pts")
    public Integer fastBreakPts;
    @JsonProperty("fast_break_att")
    public Integer fastBreakAtt;
    @JsonProperty("fast_break_made")
    public Integer fastBreakMade;
    @JsonProperty("fast_break_pct")
    public Double fastBreakPct;
    @JsonProperty("coach_ejections")
    public Integer coachEjections;
    @JsonProperty("second_chance_pct")
    public Double secondChancePct;
    @JsonProperty("second_chance_pts")
    public Integer secondChancePts;
    @JsonProperty("second_chance_att")
    public Integer secondChanceAtt;
    @JsonProperty("second_chance_made")
    public Integer secondChanceMade;
    @JsonProperty("minus")
    public Integer minus;
    @JsonProperty("plus")
    public Integer plus;
    @JsonProperty("coach_tech_fouls")
    public Integer coachTechFouls;

}
