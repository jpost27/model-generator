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
public class Punts {
    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("inside_20")
    private Integer inside20;

    @JsonProperty("touchbacks")
    private Integer touchbacks;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_net_yards")
    private Double avgNetYards;

    @JsonProperty("avg_yards")
    private Double avgYards;

    public Optional<Integer> getNetYards() {
        return Optional.ofNullable(netYards);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getBlocked() {
        return Optional.ofNullable(blocked);
    }

    public Optional<Integer> getReturnYards() {
        return Optional.ofNullable(returnYards);
    }

    public Optional<Integer> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<Integer> getTouchbacks() {
        return Optional.ofNullable(touchbacks);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Double> getAvgNetYards() {
        return Optional.ofNullable(avgNetYards);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }
}
