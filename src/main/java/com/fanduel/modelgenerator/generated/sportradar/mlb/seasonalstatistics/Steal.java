package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

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
public class Steal {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("caught")
    private Integer caught;

    @JsonProperty("pickoff")
    private Integer pickoff;

    @JsonProperty("stolen")
    private Integer stolen;

    public Optional<Double> getPct() {
        return Optional.ofNullable(pct);
    }

    public Optional<Integer> getCaught() {
        return Optional.ofNullable(caught);
    }

    public Optional<Integer> getPickoff() {
        return Optional.ofNullable(pickoff);
    }

    public Optional<Integer> getStolen() {
        return Optional.ofNullable(stolen);
    }
}
