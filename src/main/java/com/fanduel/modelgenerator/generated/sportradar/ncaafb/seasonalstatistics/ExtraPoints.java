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
public class ExtraPoints {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("missed")
    private Integer missed;

    @JsonProperty("kicks")
    private Kicks kicks;

    @JsonProperty("attempts")
    private Integer attempts;

    public Optional<Double> getPct() {
        return Optional.ofNullable(pct);
    }

    public Optional<Conversions> getConversions() {
        return Optional.ofNullable(conversions);
    }

    public Optional<Integer> getBlocked() {
        return Optional.ofNullable(blocked);
    }

    public Optional<Integer> getMade() {
        return Optional.ofNullable(made);
    }

    public Optional<Integer> getMissed() {
        return Optional.ofNullable(missed);
    }

    public Optional<Kicks> getKicks() {
        return Optional.ofNullable(kicks);
    }

    public Optional<Integer> getAttempts() {
        return Optional.ofNullable(attempts);
    }
}
