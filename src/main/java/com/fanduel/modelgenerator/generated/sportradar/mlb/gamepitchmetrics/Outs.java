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
public class Outs {
    @JsonProperty("kswing")
    private Integer kswing;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("klook")
    private Integer klook;

    public Optional<Integer> getKswing() {
        return Optional.ofNullable(kswing);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Integer> getKlook() {
        return Optional.ofNullable(klook);
    }
}
