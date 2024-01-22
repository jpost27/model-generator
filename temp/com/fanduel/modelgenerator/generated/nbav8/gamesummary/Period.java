package com.fanduel.modelgenerator.generated.nbav8.gamesummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Period {
    @JsonProperty("rebounds")
    private Integer rebounds;

    @JsonProperty("points_off_turnovers")
    private Integer pointsOffTurnovers;

    @JsonProperty("effective_fg_pct")
    private Double effectiveFgPct;

    @JsonProperty("turnovers_pct")
    private Double turnoversPct;

    @JsonProperty("fast_break_pts")
    private Integer fastBreakPts;

    @JsonProperty("player_tech_fouls")
    private Integer playerTechFouls;

    @JsonProperty("three_points_att")
    private Integer threePointsAtt;

    @JsonProperty("time_leading")
    private String timeLeading;

    @JsonProperty("type")
    private String type;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("team_rebounds")
    private Integer teamRebounds;

    @JsonProperty("possessions")
    private Double possessions;

    @JsonProperty("second_chance_att")
    private Integer secondChanceAtt;

    @JsonProperty("points_in_paint")
    private Integer pointsInPaint;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pls_min")
    private Integer plsMin;

    @JsonProperty("free_throws_made")
    private Integer freeThrowsMade;

    @JsonProperty("efficiency_game_score")
    private Double efficiencyGameScore;

    @JsonProperty("defensive_rating")
    private Double defensiveRating;

    @JsonProperty("true_shooting_pct")
    private Double trueShootingPct;

    @JsonProperty("defensive_rebounds")
    private Integer defensiveRebounds;

    @JsonProperty("efficiency")
    private Integer efficiency;

    @JsonProperty("minutes")
    private String minutes;

    @JsonProperty("flagrant_fouls")
    private Integer flagrantFouls;

    @JsonProperty("points_in_paint_made")
    private Integer pointsInPaintMade;

    @JsonProperty("second_chance_pts")
    private Integer secondChancePts;

    @JsonProperty("team_turnovers")
    private Integer teamTurnovers;

    @JsonProperty("field_goals_att")
    private Integer fieldGoalsAtt;

    @JsonProperty("free_throws_att")
    private Integer freeThrowsAtt;

    @JsonProperty("plus")
    private Integer plus;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("personal_fouls")
    private Integer personalFouls;

    @JsonProperty("total_rebounds")
    private Integer totalRebounds;

    @JsonProperty("two_points_att")
    private Integer twoPointsAtt;

    @JsonProperty("tech_fouls")
    private Integer techFouls;

    @JsonProperty("turnovers")
    private Integer turnovers;

    @JsonProperty("fast_break_pct")
    private Double fastBreakPct;

    @JsonProperty("points_in_paint_att")
    private Integer pointsInPaintAtt;

    @JsonProperty("team_tech_fouls")
    private Integer teamTechFouls;

    @JsonProperty("fouls_drawn")
    private Integer foulsDrawn;

    @JsonProperty("minus")
    private Integer minus;

    @JsonProperty("points_against")
    private Integer pointsAgainst;

    @JsonProperty("second_chance_made")
    private Integer secondChanceMade;

    @JsonProperty("three_points_pct")
    private Double threePointsPct;

    @JsonProperty("steals")
    private Integer steals;

    @JsonProperty("offensive_rebounds")
    private Integer offensiveRebounds;

    @JsonProperty("rebounds_pct")
    private Double reboundsPct;

    @JsonProperty("team_fouls")
    private Integer teamFouls;

    @JsonProperty("three_points_made")
    private Integer threePointsMade;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("second_chance_pct")
    private Double secondChancePct;

    @JsonProperty("team_offensive_rebounds")
    private Integer teamOffensiveRebounds;

    @JsonProperty("defensive_rebounds_pct")
    private Double defensiveReboundsPct;

    @JsonProperty("biggest_lead")
    private Integer biggestLead;

    @JsonProperty("field_goals_made")
    private Integer fieldGoalsMade;

    @JsonProperty("true_shooting_att")
    private Double trueShootingAtt;

    @JsonProperty("offensive_rating")
    private Double offensiveRating;

    @JsonProperty("defensive_points_per_possession")
    private Double defensivePointsPerPossession;

    @JsonProperty("offensive_rebounds_pct")
    private Double offensiveReboundsPct;

    @JsonProperty("coach_tech_fouls")
    private Integer coachTechFouls;

    @JsonProperty("blocks")
    private Integer blocks;

    @JsonProperty("offensive_fouls")
    private Integer offensiveFouls;

    @JsonProperty("offensive_points_per_possession")
    private Double offensivePointsPerPossession;

    @JsonProperty("bench_points")
    private Integer benchPoints;

    @JsonProperty("two_points_made")
    private Integer twoPointsMade;

    @JsonProperty("field_goals_pct")
    private Double fieldGoalsPct;

    @JsonProperty("team_defensive_rebounds")
    private Integer teamDefensiveRebounds;

    @JsonProperty("free_throws_pct")
    private Double freeThrowsPct;

    @JsonProperty("blocked_att")
    private Integer blockedAtt;

    @JsonProperty("fast_break_made")
    private Integer fastBreakMade;

    @JsonProperty("assists_turnover_ratio")
    private Double assistsTurnoverRatio;

    @JsonProperty("opponent_possessions")
    private Double opponentPossessions;

    @JsonProperty("points_in_paint_pct")
    private Double pointsInPaintPct;

    @JsonProperty("two_points_pct")
    private Double twoPointsPct;

    @JsonProperty("steals_pct")
    private Double stealsPct;

    @JsonProperty("fast_break_att")
    private Integer fastBreakAtt;

    @JsonProperty("total_fouls")
    private Integer totalFouls;

    public Optional<Integer> getRebounds() {
        return Optional.ofNullable(rebounds);
    }

    public Optional<Integer> getPointsOffTurnovers() {
        return Optional.ofNullable(pointsOffTurnovers);
    }

    public Optional<Double> getEffectiveFgPct() {
        return Optional.ofNullable(effectiveFgPct);
    }

    public Optional<Double> getTurnoversPct() {
        return Optional.ofNullable(turnoversPct);
    }

    public Optional<Integer> getFastBreakPts() {
        return Optional.ofNullable(fastBreakPts);
    }

    public Optional<Integer> getPlayerTechFouls() {
        return Optional.ofNullable(playerTechFouls);
    }

    public Optional<Integer> getThreePointsAtt() {
        return Optional.ofNullable(threePointsAtt);
    }

    public Optional<String> getTimeLeading() {
        return Optional.ofNullable(timeLeading);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getTeamRebounds() {
        return Optional.ofNullable(teamRebounds);
    }

    public Optional<Double> getPossessions() {
        return Optional.ofNullable(possessions);
    }

    public Optional<Integer> getSecondChanceAtt() {
        return Optional.ofNullable(secondChanceAtt);
    }

    public Optional<Integer> getPointsInPaint() {
        return Optional.ofNullable(pointsInPaint);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
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

    public Optional<Double> getDefensiveRating() {
        return Optional.ofNullable(defensiveRating);
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

    public Optional<Integer> getFlagrantFouls() {
        return Optional.ofNullable(flagrantFouls);
    }

    public Optional<Integer> getPointsInPaintMade() {
        return Optional.ofNullable(pointsInPaintMade);
    }

    public Optional<Integer> getSecondChancePts() {
        return Optional.ofNullable(secondChancePts);
    }

    public Optional<Integer> getTeamTurnovers() {
        return Optional.ofNullable(teamTurnovers);
    }

    public Optional<Integer> getFieldGoalsAtt() {
        return Optional.ofNullable(fieldGoalsAtt);
    }

    public Optional<Integer> getFreeThrowsAtt() {
        return Optional.ofNullable(freeThrowsAtt);
    }

    public Optional<Integer> getPlus() {
        return Optional.ofNullable(plus);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getPersonalFouls() {
        return Optional.ofNullable(personalFouls);
    }

    public Optional<Integer> getTotalRebounds() {
        return Optional.ofNullable(totalRebounds);
    }

    public Optional<Integer> getTwoPointsAtt() {
        return Optional.ofNullable(twoPointsAtt);
    }

    public Optional<Integer> getTechFouls() {
        return Optional.ofNullable(techFouls);
    }

    public Optional<Integer> getTurnovers() {
        return Optional.ofNullable(turnovers);
    }

    public Optional<Double> getFastBreakPct() {
        return Optional.ofNullable(fastBreakPct);
    }

    public Optional<Integer> getPointsInPaintAtt() {
        return Optional.ofNullable(pointsInPaintAtt);
    }

    public Optional<Integer> getTeamTechFouls() {
        return Optional.ofNullable(teamTechFouls);
    }

    public Optional<Integer> getFoulsDrawn() {
        return Optional.ofNullable(foulsDrawn);
    }

    public Optional<Integer> getMinus() {
        return Optional.ofNullable(minus);
    }

    public Optional<Integer> getPointsAgainst() {
        return Optional.ofNullable(pointsAgainst);
    }

    public Optional<Integer> getSecondChanceMade() {
        return Optional.ofNullable(secondChanceMade);
    }

    public Optional<Double> getThreePointsPct() {
        return Optional.ofNullable(threePointsPct);
    }

    public Optional<Integer> getSteals() {
        return Optional.ofNullable(steals);
    }

    public Optional<Integer> getOffensiveRebounds() {
        return Optional.ofNullable(offensiveRebounds);
    }

    public Optional<Double> getReboundsPct() {
        return Optional.ofNullable(reboundsPct);
    }

    public Optional<Integer> getTeamFouls() {
        return Optional.ofNullable(teamFouls);
    }

    public Optional<Integer> getThreePointsMade() {
        return Optional.ofNullable(threePointsMade);
    }

    public Optional<Integer> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<Double> getSecondChancePct() {
        return Optional.ofNullable(secondChancePct);
    }

    public Optional<Integer> getTeamOffensiveRebounds() {
        return Optional.ofNullable(teamOffensiveRebounds);
    }

    public Optional<Double> getDefensiveReboundsPct() {
        return Optional.ofNullable(defensiveReboundsPct);
    }

    public Optional<Integer> getBiggestLead() {
        return Optional.ofNullable(biggestLead);
    }

    public Optional<Integer> getFieldGoalsMade() {
        return Optional.ofNullable(fieldGoalsMade);
    }

    public Optional<Double> getTrueShootingAtt() {
        return Optional.ofNullable(trueShootingAtt);
    }

    public Optional<Double> getOffensiveRating() {
        return Optional.ofNullable(offensiveRating);
    }

    public Optional<Double> getDefensivePointsPerPossession() {
        return Optional.ofNullable(defensivePointsPerPossession);
    }

    public Optional<Double> getOffensiveReboundsPct() {
        return Optional.ofNullable(offensiveReboundsPct);
    }

    public Optional<Integer> getCoachTechFouls() {
        return Optional.ofNullable(coachTechFouls);
    }

    public Optional<Integer> getBlocks() {
        return Optional.ofNullable(blocks);
    }

    public Optional<Integer> getOffensiveFouls() {
        return Optional.ofNullable(offensiveFouls);
    }

    public Optional<Double> getOffensivePointsPerPossession() {
        return Optional.ofNullable(offensivePointsPerPossession);
    }

    public Optional<Integer> getBenchPoints() {
        return Optional.ofNullable(benchPoints);
    }

    public Optional<Integer> getTwoPointsMade() {
        return Optional.ofNullable(twoPointsMade);
    }

    public Optional<Double> getFieldGoalsPct() {
        return Optional.ofNullable(fieldGoalsPct);
    }

    public Optional<Integer> getTeamDefensiveRebounds() {
        return Optional.ofNullable(teamDefensiveRebounds);
    }

    public Optional<Double> getFreeThrowsPct() {
        return Optional.ofNullable(freeThrowsPct);
    }

    public Optional<Integer> getBlockedAtt() {
        return Optional.ofNullable(blockedAtt);
    }

    public Optional<Integer> getFastBreakMade() {
        return Optional.ofNullable(fastBreakMade);
    }

    public Optional<Double> getAssistsTurnoverRatio() {
        return Optional.ofNullable(assistsTurnoverRatio);
    }

    public Optional<Double> getOpponentPossessions() {
        return Optional.ofNullable(opponentPossessions);
    }

    public Optional<Double> getPointsInPaintPct() {
        return Optional.ofNullable(pointsInPaintPct);
    }

    public Optional<Double> getTwoPointsPct() {
        return Optional.ofNullable(twoPointsPct);
    }

    public Optional<Double> getStealsPct() {
        return Optional.ofNullable(stealsPct);
    }

    public Optional<Integer> getFastBreakAtt() {
        return Optional.ofNullable(fastBreakAtt);
    }

    public Optional<Integer> getTotalFouls() {
        return Optional.ofNullable(totalFouls);
    }
}
