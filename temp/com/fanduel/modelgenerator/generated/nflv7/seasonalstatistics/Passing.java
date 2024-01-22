package com.fanduel.modelgenerator.generated.nflv7.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
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
public class Passing {
    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("hurries")
    private Integer hurries;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("defended_passes")
    private Integer defendedPasses;

    @JsonProperty("dropped_passes")
    private Integer droppedPasses;

    @JsonProperty("pocket_time")
    private Double pocketTime;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("rating")
    private Double rating;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("air_yards")
    private Integer airYards;

    @JsonProperty("cmp_pct")
    private Double cmpPct;

    @JsonProperty("int_touchdowns")
    private Integer intTouchdowns;

    @JsonProperty("redzone_attempts")
    private Integer redzoneAttempts;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("sack_yards")
    private Integer sackYards;

    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("on_target_throws")
    private Integer onTargetThrows;

    @JsonProperty("completions")
    private Integer completions;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("avg_pocket_time")
    private Double avgPocketTime;

    @JsonProperty("knockdowns")
    private Integer knockdowns;

    @JsonProperty("interceptions")
    private Integer interceptions;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("gross_yards")
    private Integer grossYards;

    @JsonProperty("poor_throws")
    private Integer poorThrows;

    @JsonProperty("batted_passes")
    private Integer battedPasses;

    @JsonProperty("throw_aways")
    private Integer throwAways;

    @JsonProperty("spikes")
    private Integer spikes;

    @JsonProperty("sacks")
    private Integer sacks;

    @JsonProperty("blitzes")
    private Integer blitzes;

    public Optional<Integer> getNetYards() {
        return Optional.ofNullable(netYards);
    }

    public Optional<Integer> getHurries() {
        return Optional.ofNullable(hurries);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getDefendedPasses() {
        return Optional.ofNullable(defendedPasses);
    }

    public Optional<Integer> getDroppedPasses() {
        return Optional.ofNullable(droppedPasses);
    }

    public Optional<Double> getPocketTime() {
        return Optional.ofNullable(pocketTime);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Double> getRating() {
        return Optional.ofNullable(rating);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getAirYards() {
        return Optional.ofNullable(airYards);
    }

    public Optional<Double> getCmpPct() {
        return Optional.ofNullable(cmpPct);
    }

    public Optional<Integer> getIntTouchdowns() {
        return Optional.ofNullable(intTouchdowns);
    }

    public Optional<Integer> getRedzoneAttempts() {
        return Optional.ofNullable(redzoneAttempts);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }

    public Optional<Integer> getSackYards() {
        return Optional.ofNullable(sackYards);
    }

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getOnTargetThrows() {
        return Optional.ofNullable(onTargetThrows);
    }

    public Optional<Integer> getCompletions() {
        return Optional.ofNullable(completions);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Double> getAvgPocketTime() {
        return Optional.ofNullable(avgPocketTime);
    }

    public Optional<Integer> getKnockdowns() {
        return Optional.ofNullable(knockdowns);
    }

    public Optional<Integer> getInterceptions() {
        return Optional.ofNullable(interceptions);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Integer> getGrossYards() {
        return Optional.ofNullable(grossYards);
    }

    public Optional<Integer> getPoorThrows() {
        return Optional.ofNullable(poorThrows);
    }

    public Optional<Integer> getBattedPasses() {
        return Optional.ofNullable(battedPasses);
    }

    public Optional<Integer> getThrowAways() {
        return Optional.ofNullable(throwAways);
    }

    public Optional<Integer> getSpikes() {
        return Optional.ofNullable(spikes);
    }

    public Optional<Integer> getSacks() {
        return Optional.ofNullable(sacks);
    }

    public Optional<Integer> getBlitzes() {
        return Optional.ofNullable(blitzes);
    }
}
