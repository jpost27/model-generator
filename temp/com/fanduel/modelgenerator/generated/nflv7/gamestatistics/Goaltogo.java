package com.fanduel.modelgenerator.generated.nflv7.gamestatistics;

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
public class Goaltogo {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("successes")
    private Integer successes;

    @JsonProperty("attempts")
    private Integer attempts;

    public Optional<Double> getPct() {
        return Optional.ofNullable(pct);
    }

    public Optional<Integer> getSuccesses() {
        return Optional.ofNullable(successes);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }
}
