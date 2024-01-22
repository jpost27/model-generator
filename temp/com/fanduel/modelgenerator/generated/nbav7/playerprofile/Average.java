package com.fanduel.modelgenerator.generated.nbav7.playerprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Average {
    @JsonProperty("rebounds")
    private Double rebounds;

    @JsonProperty("second_chance_made")
    private Double secondChanceMade;

    @JsonProperty("off_rebounds")
    private Double offRebounds;

    @JsonProperty("points_off_turnovers")
    private Double pointsOffTurnovers;

    @JsonProperty("fast_break_pts")
    private Double fastBreakPts;

    @JsonProperty("three_points_att")
    private Double threePointsAtt;

    @JsonProperty("steals")
    private Double steals;

    @JsonProperty("points")
    private Double points;

    @JsonProperty("assists")
    private Double assists;

    @JsonProperty("three_points_made")
    private Double threePointsMade;

    @JsonProperty("second_chance_att")
    private Double secondChanceAtt;

    @JsonProperty("points_in_paint")
    private Double pointsInPaint;

    @JsonProperty("def_rebounds")
    private Double defRebounds;

    @JsonProperty("free_throws_made")
    private Double freeThrowsMade;

    @JsonProperty("field_goals_made")
    private Double fieldGoalsMade;

    @JsonProperty("true_shooting_att")
    private Double trueShootingAtt;

    @JsonProperty("efficiency")
    private Double efficiency;

    @JsonProperty("minutes")
    private Double minutes;

    @JsonProperty("blocks")
    private Double blocks;

    @JsonProperty("flagrant_fouls")
    private Double flagrantFouls;

    @JsonProperty("offensive_fouls")
    private Double offensiveFouls;

    @JsonProperty("points_in_paint_made")
    private Double pointsInPaintMade;

    @JsonProperty("second_chance_pts")
    private Double secondChancePts;

    @JsonProperty("two_points_made")
    private Double twoPointsMade;

    @JsonProperty("field_goals_att")
    private Double fieldGoalsAtt;

    @JsonProperty("free_throws_att")
    private Double freeThrowsAtt;

    @JsonProperty("blocked_att")
    private Double blockedAtt;

    @JsonProperty("fast_break_made")
    private Double fastBreakMade;

    @JsonProperty("personal_fouls")
    private Double personalFouls;

    @JsonProperty("two_points_att")
    private Double twoPointsAtt;

    @JsonProperty("turnovers")
    private Double turnovers;

    @JsonProperty("fast_break_att")
    private Double fastBreakAtt;

    @JsonProperty("points_in_paint_att")
    private Double pointsInPaintAtt;

    @JsonProperty("fouls_drawn")
    private Double foulsDrawn;

    public Optional<Double> getRebounds() {
        return Optional.ofNullable(rebounds);
    }

    public Optional<Double> getSecondChanceMade() {
        return Optional.ofNullable(secondChanceMade);
    }

    public Optional<Double> getOffRebounds() {
        return Optional.ofNullable(offRebounds);
    }

    public Optional<Double> getPointsOffTurnovers() {
        return Optional.ofNullable(pointsOffTurnovers);
    }

    public Optional<Double> getFastBreakPts() {
        return Optional.ofNullable(fastBreakPts);
    }

    public Optional<Double> getThreePointsAtt() {
        return Optional.ofNullable(threePointsAtt);
    }

    public Optional<Double> getSteals() {
        return Optional.ofNullable(steals);
    }

    public Optional<Double> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Double> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<Double> getThreePointsMade() {
        return Optional.ofNullable(threePointsMade);
    }

    public Optional<Double> getSecondChanceAtt() {
        return Optional.ofNullable(secondChanceAtt);
    }

    public Optional<Double> getPointsInPaint() {
        return Optional.ofNullable(pointsInPaint);
    }

    public Optional<Double> getDefRebounds() {
        return Optional.ofNullable(defRebounds);
    }

    public Optional<Double> getFreeThrowsMade() {
        return Optional.ofNullable(freeThrowsMade);
    }

    public Optional<Double> getFieldGoalsMade() {
        return Optional.ofNullable(fieldGoalsMade);
    }

    public Optional<Double> getTrueShootingAtt() {
        return Optional.ofNullable(trueShootingAtt);
    }

    public Optional<Double> getEfficiency() {
        return Optional.ofNullable(efficiency);
    }

    public Optional<Double> getMinutes() {
        return Optional.ofNullable(minutes);
    }

    public Optional<Double> getBlocks() {
        return Optional.ofNullable(blocks);
    }

    public Optional<Double> getFlagrantFouls() {
        return Optional.ofNullable(flagrantFouls);
    }

    public Optional<Double> getOffensiveFouls() {
        return Optional.ofNullable(offensiveFouls);
    }

    public Optional<Double> getPointsInPaintMade() {
        return Optional.ofNullable(pointsInPaintMade);
    }

    public Optional<Double> getSecondChancePts() {
        return Optional.ofNullable(secondChancePts);
    }

    public Optional<Double> getTwoPointsMade() {
        return Optional.ofNullable(twoPointsMade);
    }

    public Optional<Double> getFieldGoalsAtt() {
        return Optional.ofNullable(fieldGoalsAtt);
    }

    public Optional<Double> getFreeThrowsAtt() {
        return Optional.ofNullable(freeThrowsAtt);
    }

    public Optional<Double> getBlockedAtt() {
        return Optional.ofNullable(blockedAtt);
    }

    public Optional<Double> getFastBreakMade() {
        return Optional.ofNullable(fastBreakMade);
    }

    public Optional<Double> getPersonalFouls() {
        return Optional.ofNullable(personalFouls);
    }

    public Optional<Double> getTwoPointsAtt() {
        return Optional.ofNullable(twoPointsAtt);
    }

    public Optional<Double> getTurnovers() {
        return Optional.ofNullable(turnovers);
    }

    public Optional<Double> getFastBreakAtt() {
        return Optional.ofNullable(fastBreakAtt);
    }

    public Optional<Double> getPointsInPaintAtt() {
        return Optional.ofNullable(pointsInPaintAtt);
    }

    public Optional<Double> getFoulsDrawn() {
        return Optional.ofNullable(foulsDrawn);
    }
}
