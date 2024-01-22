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
public class PuntReturns {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("returns")
    private Integer returns;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("faircatches")
    private Integer faircatches;

    public Optional<Integer> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getLongestTouchdown() {
        return Optional.ofNullable(longestTouchdown);
    }

    public Optional<Integer> getReturns() {
        return Optional.ofNullable(returns);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getFaircatches() {
        return Optional.ofNullable(faircatches);
    }
}
