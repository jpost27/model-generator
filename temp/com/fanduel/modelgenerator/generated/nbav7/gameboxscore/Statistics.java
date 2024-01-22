package com.fanduel.modelgenerator.generated.nbav7.gameboxscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
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

    public Optional<Boolean> getDoubleDouble() {
        return Optional.ofNullable(doubleDouble);
    }

    public Optional<Integer> getRebounds() {
        return Optional.ofNullable(rebounds);
    }

    public Optional<Integer> getPointsOffTurnovers() {
        return Optional.ofNullable(pointsOffTurnovers);
    }

    public Optional<Double> getEffectiveFgPct() {
        return Optional.ofNullable(effectiveFgPct);
    }

    public Optional<Integer> getThreePointsAtt() {
        return Optional.ofNullable(threePointsAtt);
    }

    public Optional<Double> getThreePointsPct() {
        return Optional.ofNullable(threePointsPct);
    }

    public Optional<Integer> getSteals() {
        return Optional.ofNullable(steals);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Integer> getOffensiveRebounds() {
        return Optional.ofNullable(offensiveRebounds);
    }

    public Optional<Integer> getThreePointsMade() {
        return Optional.ofNullable(threePointsMade);
    }

    public Optional<Integer> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<Boolean> getTripleDouble() {
        return Optional.ofNullable(tripleDouble);
    }

    public Optional<Integer> getPointsInPaint() {
        return Optional.ofNullable(pointsInPaint);
    }

    public Optional<Integer> getPlsMin() {
        return Optional.ofNullable(plsMin);
    }

    public Optional<Integer> getFreeThrowsMade() {
        return Optional.ofNullable(freeThrowsMade);
    }

    public Optional<Double> getEfficiencyGameScore() {
        return Optional.ofNullable(efficiencyGameScore);
    }

    public Optional<Integer> getFieldGoalsMade() {
        return Optional.ofNullable(fieldGoalsMade);
    }

    public Optional<Double> getTrueShootingAtt() {
        return Optional.ofNullable(trueShootingAtt);
    }

    public Optional<Double> getTrueShootingPct() {
        return Optional.ofNullable(trueShootingPct);
    }

    public Optional<Integer> getDefensiveRebounds() {
        return Optional.ofNullable(defensiveRebounds);
    }

    public Optional<Integer> getEfficiency() {
        return Optional.ofNullable(efficiency);
    }

    public Optional<String> getMinutes() {
        return Optional.ofNullable(minutes);
    }

    public Optional<Integer> getBlocks() {
        return Optional.ofNullable(blocks);
    }

    public Optional<Integer> getFlagrantFouls() {
        return Optional.ofNullable(flagrantFouls);
    }

    public Optional<Integer> getOffensiveFouls() {
        return Optional.ofNullable(offensiveFouls);
    }

    public Optional<Integer> getPointsInPaintMade() {
        return Optional.ofNullable(pointsInPaintMade);
    }

    public Optional<Integer> getSecondChancePts() {
        return Optional.ofNullable(secondChancePts);
    }

    public Optional<Integer> getTwoPointsMade() {
        return Optional.ofNullable(twoPointsMade);
    }

    public Optional<Integer> getFieldGoalsAtt() {
        return Optional.ofNullable(fieldGoalsAtt);
    }

    public Optional<Double> getFieldGoalsPct() {
        return Optional.ofNullable(fieldGoalsPct);
    }

    public Optional<Integer> getFreeThrowsAtt() {
        return Optional.ofNullable(freeThrowsAtt);
    }

    public Optional<Double> getFreeThrowsPct() {
        return Optional.ofNullable(freeThrowsPct);
    }

    public Optional<Integer> getBlockedAtt() {
        return Optional.ofNullable(blockedAtt);
    }

    public Optional<Double> getAssistsTurnoverRatio() {
        return Optional.ofNullable(assistsTurnoverRatio);
    }

    public Optional<Integer> getPersonalFouls() {
        return Optional.ofNullable(personalFouls);
    }

    public Optional<Double> getPointsInPaintPct() {
        return Optional.ofNullable(pointsInPaintPct);
    }

    public Optional<Integer> getTwoPointsAtt() {
        return Optional.ofNullable(twoPointsAtt);
    }

    public Optional<Double> getTwoPointsPct() {
        return Optional.ofNullable(twoPointsPct);
    }

    public Optional<Integer> getTechFouls() {
        return Optional.ofNullable(techFouls);
    }

    public Optional<Integer> getTurnovers() {
        return Optional.ofNullable(turnovers);
    }

    public Optional<Integer> getPointsInPaintAtt() {
        return Optional.ofNullable(pointsInPaintAtt);
    }

    public Optional<Integer> getFoulsDrawn() {
        return Optional.ofNullable(foulsDrawn);
    }
}
