package com.fanduel.modelgenerator.generated.sportradar.golf.playerstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Statistics {
    @JsonProperty("drive_acc")
    private Double driveAcc;

    @JsonProperty("second_place")
    private Integer secondPlace;

    @JsonProperty("scoring_avg")
    private Double scoringAvg;

    @JsonProperty("top_25")
    private Integer top25;

    @JsonProperty("gir_pct")
    private Double girPct;

    @JsonProperty("points")
    private Double points;

    @JsonProperty("holes_per_eagle")
    private Double holesPerEagle;

    @JsonProperty("sand_saves_pct")
    private Double sandSavesPct;

    @JsonProperty("third_place")
    private Integer thirdPlace;

    @JsonProperty("earnings_rank")
    private Integer earningsRank;

    @JsonProperty("cuts_made")
    private Integer cutsMade;

    @JsonProperty("cuts")
    private Integer cuts;

    @JsonProperty("strokes_gained_tee_green")
    private Double strokesGainedTeeGreen;

    @JsonProperty("strokes_gained")
    private Double strokesGained;

    @JsonProperty("top_10")
    private Integer top10;

    @JsonProperty("birdies_per_round")
    private Double birdiesPerRound;

    @JsonProperty("first_place")
    private Integer firstPlace;

    @JsonProperty("strokes_gained_total")
    private Double strokesGainedTotal;

    @JsonProperty("total_driving")
    private Integer totalDriving;

    @JsonProperty("hole_proximity_avg")
    private String holeProximityAvg;

    @JsonProperty("scrambling_pct")
    private Double scramblingPct;

    @JsonProperty("points_rank")
    private Integer pointsRank;

    @JsonProperty("withdrawals")
    private Integer withdrawals;

    @JsonProperty("earnings")
    private Double earnings;

    @JsonProperty("putt_avg")
    private Double puttAvg;

    @JsonProperty("world_rank")
    private Integer worldRank;

    @JsonProperty("events_played")
    private Integer eventsPlayed;

    @JsonProperty("drive_avg")
    private Double driveAvg;

    public Optional<Double> getDriveAcc() {
        return Optional.ofNullable(driveAcc);
    }

    public Optional<Integer> getSecondPlace() {
        return Optional.ofNullable(secondPlace);
    }

    public Optional<Double> getScoringAvg() {
        return Optional.ofNullable(scoringAvg);
    }

    public Optional<Integer> getTop25() {
        return Optional.ofNullable(top25);
    }

    public Optional<Double> getGirPct() {
        return Optional.ofNullable(girPct);
    }

    public Optional<Double> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Double> getHolesPerEagle() {
        return Optional.ofNullable(holesPerEagle);
    }

    public Optional<Double> getSandSavesPct() {
        return Optional.ofNullable(sandSavesPct);
    }

    public Optional<Integer> getThirdPlace() {
        return Optional.ofNullable(thirdPlace);
    }

    public Optional<Integer> getEarningsRank() {
        return Optional.ofNullable(earningsRank);
    }

    public Optional<Integer> getCutsMade() {
        return Optional.ofNullable(cutsMade);
    }

    public Optional<Integer> getCuts() {
        return Optional.ofNullable(cuts);
    }

    public Optional<Double> getStrokesGainedTeeGreen() {
        return Optional.ofNullable(strokesGainedTeeGreen);
    }

    public Optional<Double> getStrokesGained() {
        return Optional.ofNullable(strokesGained);
    }

    public Optional<Integer> getTop10() {
        return Optional.ofNullable(top10);
    }

    public Optional<Double> getBirdiesPerRound() {
        return Optional.ofNullable(birdiesPerRound);
    }

    public Optional<Integer> getFirstPlace() {
        return Optional.ofNullable(firstPlace);
    }

    public Optional<Double> getStrokesGainedTotal() {
        return Optional.ofNullable(strokesGainedTotal);
    }

    public Optional<Integer> getTotalDriving() {
        return Optional.ofNullable(totalDriving);
    }

    public Optional<String> getHoleProximityAvg() {
        return Optional.ofNullable(holeProximityAvg);
    }

    public Optional<Double> getScramblingPct() {
        return Optional.ofNullable(scramblingPct);
    }

    public Optional<Integer> getPointsRank() {
        return Optional.ofNullable(pointsRank);
    }

    public Optional<Integer> getWithdrawals() {
        return Optional.ofNullable(withdrawals);
    }

    public Optional<Double> getEarnings() {
        return Optional.ofNullable(earnings);
    }

    public Optional<Double> getPuttAvg() {
        return Optional.ofNullable(puttAvg);
    }

    public Optional<Integer> getWorldRank() {
        return Optional.ofNullable(worldRank);
    }

    public Optional<Integer> getEventsPlayed() {
        return Optional.ofNullable(eventsPlayed);
    }

    public Optional<Double> getDriveAvg() {
        return Optional.ofNullable(driveAvg);
    }
}
