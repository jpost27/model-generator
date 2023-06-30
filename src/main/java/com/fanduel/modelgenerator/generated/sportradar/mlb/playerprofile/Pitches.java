package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

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
public class Pitches {
    @JsonProperty("btotal")
    private Integer btotal;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("count")
    private Integer count;

    public Optional<Integer> getBtotal() {
        return Optional.ofNullable(btotal);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(count);
    }
}
