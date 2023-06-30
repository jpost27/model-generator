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
public class Receiving {
    @JsonProperty("redzone_targets")
    private Integer redzoneTargets;

    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("air_yards")
    private Integer airYards;

    @JsonProperty("receptions")
    private Integer receptions;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("targets")
    private Integer targets;

    @JsonProperty("yards_after_catch")
    private Integer yardsAfterCatch;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_yards")
    private Double avgYards;

    public Optional<Integer> getRedzoneTargets() {
        return Optional.ofNullable(redzoneTargets);
    }

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getAirYards() {
        return Optional.ofNullable(airYards);
    }

    public Optional<Integer> getReceptions() {
        return Optional.ofNullable(receptions);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Integer> getTargets() {
        return Optional.ofNullable(targets);
    }

    public Optional<Integer> getYardsAfterCatch() {
        return Optional.ofNullable(yardsAfterCatch);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }
}
