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
public class Redzone {
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
