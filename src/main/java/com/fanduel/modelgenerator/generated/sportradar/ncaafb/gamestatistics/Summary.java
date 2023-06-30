package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gamestatistics;

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
public class Summary {
    @JsonProperty("possession_time")
    private String possessionTime;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("total_yards")
    private Integer totalYards;

    @JsonProperty("week")
    private Week week;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("penalties")
    private Integer penalties;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("rush_plays")
    private Integer rushPlays;

    @JsonProperty("fumbles")
    private Integer fumbles;

    @JsonProperty("safeties")
    private Integer safeties;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("play_count")
    private Integer playCount;

    @JsonProperty("lost_fumbles")
    private Integer lostFumbles;

    @JsonProperty("avg_gain")
    private Double avgGain;

    @JsonProperty("turnovers")
    private Integer turnovers;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("penalty_yards")
    private Integer penaltyYards;

    public Optional<String> getPossessionTime() {
        return Optional.ofNullable(possessionTime);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Integer> getTotalYards() {
        return Optional.ofNullable(totalYards);
    }

    public Optional<Week> getWeek() {
        return Optional.ofNullable(week);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Integer> getPenalties() {
        return Optional.ofNullable(penalties);
    }

    public Optional<Integer> getReturnYards() {
        return Optional.ofNullable(returnYards);
    }

    public Optional<Integer> getRushPlays() {
        return Optional.ofNullable(rushPlays);
    }

    public Optional<Integer> getFumbles() {
        return Optional.ofNullable(fumbles);
    }

    public Optional<Integer> getSafeties() {
        return Optional.ofNullable(safeties);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<Integer> getPlayCount() {
        return Optional.ofNullable(playCount);
    }

    public Optional<Integer> getLostFumbles() {
        return Optional.ofNullable(lostFumbles);
    }

    public Optional<Double> getAvgGain() {
        return Optional.ofNullable(avgGain);
    }

    public Optional<Integer> getTurnovers() {
        return Optional.ofNullable(turnovers);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<Integer> getPenaltyYards() {
        return Optional.ofNullable(penaltyYards);
    }
}
