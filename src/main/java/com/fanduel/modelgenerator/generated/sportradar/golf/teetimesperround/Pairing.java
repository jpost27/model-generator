package com.fanduel.modelgenerator.generated.sportradar.golf.teetimesperround;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Pairing {
    @JsonProperty("back_nine")
    private Boolean backNine;

    @JsonProperty("tee_time")
    private String teeTime;

    @JsonProperty("players")
    private List<Player> players;

    public Optional<Boolean> getBackNine() {
        return Optional.ofNullable(backNine);
    }

    public Optional<String> getTeeTime() {
        return Optional.ofNullable(teeTime);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }
}
