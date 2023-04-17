package com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistics {
    @JsonProperty("double_double")
    private Boolean doubleDouble;

    @JsonProperty("rebounds")
    private Integer rebounds;

    @JsonProperty("points_off_turnovers")
    private Integer pointsOffTurnovers;

    @JsonProperty("effective_fg_pct")
    private Double effectiveFgPct;

    @JsonProperty("three_points_att")
    private Integer threePointsAtt;

    @JsonProperty("three_points_pct")
    private Double threePointsPct;

    @JsonProperty("steals")
    private Integer steals;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("offensive_rebounds")
    private Integer offensiveRebounds;

    @JsonProperty("three_points_made")
    private Integer threePointsMade;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("triple_double")
    private Boolean tripleDouble;

    @JsonProperty("points_in_paint")
    private Integer pointsInPaint;

    @JsonProperty("pls_min")
    private Integer plsMin;

    @JsonProperty("free_throws_made")
    private Integer freeThrowsMade;

    @JsonProperty("efficiency_game_score")
    private Double efficiencyGameScore;

    @JsonProperty("field_goals_made")
    private Integer fieldGoalsMade;

    @JsonProperty("true_shooting_att")
    private Double trueShootingAtt;

    @JsonProperty("true_shooting_pct")
    private Double trueShootingPct;

    @JsonProperty("defensive_rebounds")
    private Integer defensiveRebounds;

    @JsonProperty("efficiency")
    private Integer efficiency;

    @JsonProperty("minutes")
    private String minutes;

    @JsonProperty("blocks")
    private Integer blocks;

    @JsonProperty("flagrant_fouls")
    private Integer flagrantFouls;

    @JsonProperty("offensive_fouls")
    private Integer offensiveFouls;

    @JsonProperty("points_in_paint_made")
    private Integer pointsInPaintMade;

    @JsonProperty("second_chance_pts")
    private Integer secondChancePts;

    @JsonProperty("two_points_made")
    private Integer twoPointsMade;

    @JsonProperty("field_goals_att")
    private Integer fieldGoalsAtt;

    @JsonProperty("field_goals_pct")
    private Double fieldGoalsPct;

    @JsonProperty("free_throws_att")
    private Integer freeThrowsAtt;

    @JsonProperty("free_throws_pct")
    private Double freeThrowsPct;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("assists_turnover_ratio")
    private Double assistsTurnoverRatio;

    @JsonProperty("personal_fouls")
    private Integer personalFouls;

    @JsonProperty("points_in_paint_pct")
    private Double pointsInPaintPct;

    @JsonProperty("two_points_att")
    private Integer twoPointsAtt;

    @JsonProperty("two_points_pct")
    private Double twoPointsPct;

    @JsonProperty("tech_fouls")
    private Integer techFouls;

    @JsonProperty("turnovers")
    private Integer turnovers;

    @JsonProperty("points_in_paint_att")
    private Integer pointsInPaintAtt;

    @JsonProperty("fouls_drawn")
    private Integer foulsDrawn;
}
