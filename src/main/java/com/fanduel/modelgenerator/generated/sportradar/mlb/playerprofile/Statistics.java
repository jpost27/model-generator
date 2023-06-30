package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Statistics {
    @JsonProperty("fielding")
    private Fielding fielding;

    @JsonProperty("hitting")
    private Hitting hitting;

    public Optional<Fielding> getFielding() {
        return Optional.ofNullable(fielding);
    }

    public Optional<Hitting> getHitting() {
        return Optional.ofNullable(hitting);
    }
}
