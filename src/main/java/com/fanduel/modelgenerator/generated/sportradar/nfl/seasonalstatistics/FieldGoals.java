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
public class FieldGoals {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("missed")
    private Integer missed;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("attempts_50")
    private Integer attempts50;

    @JsonProperty("made_50")
    private Integer made50;

    @JsonProperty("attempts_39")
    private Integer attempts39;

    @JsonProperty("attempts_29")
    private Integer attempts29;

    @JsonProperty("attempts_19")
    private Integer attempts19;

    @JsonProperty("made_29")
    private Integer made29;

    @JsonProperty("made_19")
    private Integer made19;

    @JsonProperty("made_49")
    private Integer made49;

    @JsonProperty("made_39")
    private Integer made39;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("attempts_49")
    private Integer attempts49;

    public Optional<Double> getPct() {
        return Optional.ofNullable(pct);
    }

    public Optional<Integer> getLongest() {
        return Optional.ofNullable(longest);
    }

    public Optional<Integer> getMade() {
        return Optional.ofNullable(made);
    }

    public Optional<Integer> getMissed() {
        return Optional.ofNullable(missed);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Double> getAvgYards() {
        return Optional.ofNullable(avgYards);
    }

    public Optional<Integer> getBlocked() {
        return Optional.ofNullable(blocked);
    }

    public Optional<Integer> getAttempts50() {
        return Optional.ofNullable(attempts50);
    }

    public Optional<Integer> getMade50() {
        return Optional.ofNullable(made50);
    }

    public Optional<Integer> getAttempts39() {
        return Optional.ofNullable(attempts39);
    }

    public Optional<Integer> getAttempts29() {
        return Optional.ofNullable(attempts29);
    }

    public Optional<Integer> getAttempts19() {
        return Optional.ofNullable(attempts19);
    }

    public Optional<Integer> getMade29() {
        return Optional.ofNullable(made29);
    }

    public Optional<Integer> getMade19() {
        return Optional.ofNullable(made19);
    }

    public Optional<Integer> getMade49() {
        return Optional.ofNullable(made49);
    }

    public Optional<Integer> getMade39() {
        return Optional.ofNullable(made39);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }

    public Optional<Integer> getAttempts49() {
        return Optional.ofNullable(attempts49);
    }
}
