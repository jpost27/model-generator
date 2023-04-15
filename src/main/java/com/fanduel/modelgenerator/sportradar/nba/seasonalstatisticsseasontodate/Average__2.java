
package com.fanduel.modelgenerator.sportradar.nba.seasonalstatisticsseasontodate;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minutes",
    "points",
    "off_rebounds",
    "def_rebounds",
    "rebounds",
    "assists",
    "steals",
    "blocks",
    "turnovers",
    "personal_fouls",
    "flagrant_fouls",
    "blocked_att",
    "field_goals_made",
    "field_goals_att",
    "three_points_made",
    "three_points_att",
    "free_throws_made",
    "free_throws_att",
    "two_points_made",
    "two_points_att",
    "efficiency",
    "true_shooting_att",
    "points_off_turnovers",
    "points_in_paint_made",
    "points_in_paint_att",
    "points_in_paint",
    "fouls_drawn",
    "offensive_fouls",
    "fast_break_pts",
    "fast_break_att",
    "fast_break_made",
    "second_chance_pts",
    "second_chance_att",
    "second_chance_made"
})
@Generated("jsonschema2pojo")
public class Average__2 {

    @JsonProperty("minutes")
    public Double minutes;
    @JsonProperty("points")
    public Double points;
    @JsonProperty("off_rebounds")
    public Double offRebounds;
    @JsonProperty("def_rebounds")
    public Double defRebounds;
    @JsonProperty("rebounds")
    public Double rebounds;
    @JsonProperty("assists")
    public Double assists;
    @JsonProperty("steals")
    public Double steals;
    @JsonProperty("blocks")
    public Double blocks;
    @JsonProperty("turnovers")
    public Double turnovers;
    @JsonProperty("personal_fouls")
    public Double personalFouls;
    @JsonProperty("flagrant_fouls")
    public Double flagrantFouls;
    @JsonProperty("blocked_att")
    public Double blockedAtt;
    @JsonProperty("field_goals_made")
    public Double fieldGoalsMade;
    @JsonProperty("field_goals_att")
    public Double fieldGoalsAtt;
    @JsonProperty("three_points_made")
    public Double threePointsMade;
    @JsonProperty("three_points_att")
    public Double threePointsAtt;
    @JsonProperty("free_throws_made")
    public Double freeThrowsMade;
    @JsonProperty("free_throws_att")
    public Double freeThrowsAtt;
    @JsonProperty("two_points_made")
    public Double twoPointsMade;
    @JsonProperty("two_points_att")
    public Double twoPointsAtt;
    @JsonProperty("efficiency")
    public Double efficiency;
    @JsonProperty("true_shooting_att")
    public Double trueShootingAtt;
    @JsonProperty("points_off_turnovers")
    public Double pointsOffTurnovers;
    @JsonProperty("points_in_paint_made")
    public Double pointsInPaintMade;
    @JsonProperty("points_in_paint_att")
    public Double pointsInPaintAtt;
    @JsonProperty("points_in_paint")
    public Double pointsInPaint;
    @JsonProperty("fouls_drawn")
    public Double foulsDrawn;
    @JsonProperty("offensive_fouls")
    public Double offensiveFouls;
    @JsonProperty("fast_break_pts")
    public Double fastBreakPts;
    @JsonProperty("fast_break_att")
    public Double fastBreakAtt;
    @JsonProperty("fast_break_made")
    public Double fastBreakMade;
    @JsonProperty("second_chance_pts")
    public Double secondChancePts;
    @JsonProperty("second_chance_att")
    public Double secondChanceAtt;
    @JsonProperty("second_chance_made")
    public Double secondChanceMade;

}
