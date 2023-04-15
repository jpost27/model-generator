
package com.fanduel.modelgenerator.sportradar.nba.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
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
    "tech_fouls",
    "flagrant_fouls",
    "pls_min",
    "points",
    "double_double",
    "triple_double",
    "effective_fg_pct",
    "efficiency",
    "efficiency_game_score",
    "points_in_paint",
    "points_in_paint_att",
    "points_in_paint_made",
    "points_in_paint_pct",
    "true_shooting_att",
    "true_shooting_pct",
    "fouls_drawn",
    "offensive_fouls",
    "points_off_turnovers",
    "second_chance_pts"
})
@Generated("jsonschema2pojo")
public class Statistics__1 {

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
    @JsonProperty("tech_fouls")
    public Integer techFouls;
    @JsonProperty("flagrant_fouls")
    public Integer flagrantFouls;
    @JsonProperty("pls_min")
    public Integer plsMin;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("double_double")
    public Boolean doubleDouble;
    @JsonProperty("triple_double")
    public Boolean tripleDouble;
    @JsonProperty("effective_fg_pct")
    public Double effectiveFgPct;
    @JsonProperty("efficiency")
    public Integer efficiency;
    @JsonProperty("efficiency_game_score")
    public Double efficiencyGameScore;
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
    @JsonProperty("fouls_drawn")
    public Integer foulsDrawn;
    @JsonProperty("offensive_fouls")
    public Integer offensiveFouls;
    @JsonProperty("points_off_turnovers")
    public Integer pointsOffTurnovers;
    @JsonProperty("second_chance_pts")
    public Integer secondChancePts;

}
