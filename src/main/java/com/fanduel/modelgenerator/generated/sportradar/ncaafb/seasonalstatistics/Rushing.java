package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonalstatistics;

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
public class Rushing {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("redzone_attempts")
    private Integer redzoneAttempts;

    @JsonProperty("tlost_yards")
    private Integer tlostYards;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("tlost")
    private Integer tlost;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("yards")
    private Integer yards;

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Integer> getRedzoneAttempts() {
        return Optional.ofNullable(redzoneAttempts);
    }

    public Optional<Integer> getTlostYards() {
        return Optional.ofNullable(tlostYards);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Integer> getTlost() {
        return Optional.ofNullable(tlost);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }
}
