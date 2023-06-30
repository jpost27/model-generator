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
public class Kicks {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("attempts")
    private Integer attempts;

    public Optional<Double> getPct() {
        return Optional.ofNullable(pct);
    }

    public Optional<Integer> getBlocked() {
        return Optional.ofNullable(blocked);
    }

    public Optional<Integer> getMade() {
        return Optional.ofNullable(made);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }
}
