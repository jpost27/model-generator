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
