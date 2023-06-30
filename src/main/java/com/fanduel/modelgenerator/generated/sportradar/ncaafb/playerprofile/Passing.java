package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Passing {
    @JsonProperty("sack_yards")
    private Integer sackYards;

    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("rating")
    private Double rating;

    @JsonProperty("completions")
    private Integer completions;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("interceptions")
    private Integer interceptions;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("air_yards")
    private Integer airYards;

    @JsonProperty("gross_yards")
    private Integer grossYards;

    @JsonProperty("cmp_pct")
    private Double cmpPct;

    @JsonProperty("int_touchdowns")
    private Integer intTouchdowns;

    @JsonProperty("redzone_attempts")
    private Integer redzoneAttempts;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("sacks")
    private Integer sacks;

    public Optional<Integer> getSackYards() {
        return Optional.ofNullable(sackYards);
    }

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Double> getRating() {
        return Optional.ofNullable(rating);
    }

    public Optional<Integer> getCompletions() {
        return Optional.ofNullable(completions);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Integer> getInterceptions() {
        return Optional.ofNullable(interceptions);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getAirYards() {
        return Optional.ofNullable(airYards);
    }

    public Optional<Integer> getGrossYards() {
        return Optional.ofNullable(grossYards);
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

    public Optional<Integer> getSacks() {
        return Optional.ofNullable(sacks);
    }
}
