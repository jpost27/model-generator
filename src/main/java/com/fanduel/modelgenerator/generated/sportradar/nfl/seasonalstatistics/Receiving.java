package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

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
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("dropped_passes")
    private Integer droppedPasses;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("yards_after_contact")
    private Integer yardsAfterContact;

    @JsonProperty("broken_tackles")
    private Integer brokenTackles;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("targets")
    private Integer targets;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("redzone_targets")
    private Integer redzoneTargets;

    @JsonProperty("air_yards")
    private Integer airYards;

    @JsonProperty("receptions")
    private Integer receptions;

    @JsonProperty("catchable_passes")
    private Integer catchablePasses;

    @JsonProperty("yards_after_catch")
    private Integer yardsAfterCatch;

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getDroppedPasses() {
        return Optional.ofNullable(droppedPasses);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Integer> getYardsAfterContact() {
        return Optional.ofNullable(yardsAfterContact);
    }

    public Optional<Integer> getBrokenTackles() {
        return Optional.ofNullable(brokenTackles);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Integer> getTargets() {
        return Optional.ofNullable(targets);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Integer> getRedzoneTargets() {
        return Optional.ofNullable(redzoneTargets);
    }

    public Optional<Integer> getAirYards() {
        return Optional.ofNullable(airYards);
    }

    public Optional<Integer> getReceptions() {
        return Optional.ofNullable(receptions);
    }

    public Optional<Integer> getCatchablePasses() {
        return Optional.ofNullable(catchablePasses);
    }

    public Optional<Integer> getYardsAfterCatch() {
        return Optional.ofNullable(yardsAfterCatch);
    }
}
