package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

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
public class Swings {
    @JsonProperty("swing_rate")
    private Double swingRate;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("whiff_rate")
    private Double whiffRate;

    @JsonProperty("strike_pct")
    private Double strikePct;

    public Optional<Double> getSwingRate() {
        return Optional.ofNullable(swingRate);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Double> getWhiffRate() {
        return Optional.ofNullable(whiffRate);
    }

    public Optional<Double> getStrikePct() {
        return Optional.ofNullable(strikePct);
    }
}
