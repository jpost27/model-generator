package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

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
public class Scoring {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("home")
    private Home home;

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }
}
