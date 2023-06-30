package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Integer pct;

    @JsonProperty("caught")
    private Integer caught;

    @JsonProperty("pickoff")
    private Integer pickoff;

    @JsonProperty("stolen")
    private Integer stolen;

    public Optional<Integer> getPct() {
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
