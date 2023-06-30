package com.fanduel.modelgenerator.generated.sportradar.mlb.mlbapiv7simulations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Broadcast {
    @JsonProperty("network")
    private String network;

    public Optional<String> getNetwork() {
        return Optional.ofNullable(network);
    }
}
