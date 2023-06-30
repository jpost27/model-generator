package com.fanduel.modelgenerator.generated.sportradar.mlb.gamepitchmetrics;

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
public class Onbase {
    @JsonProperty("s")
    private Integer s;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("hr")
    private Integer hr;

    public Optional<Integer> getS() {
        return Optional.ofNullable(s);
    }

    public Optional<Integer> getD() {
        return Optional.ofNullable(d);
    }

    public Optional<Integer> getT() {
        return Optional.ofNullable(t);
    }

    public Optional<Integer> getH() {
        return Optional.ofNullable(h);
    }

    public Optional<Integer> getHr() {
        return Optional.ofNullable(hr);
    }
}
