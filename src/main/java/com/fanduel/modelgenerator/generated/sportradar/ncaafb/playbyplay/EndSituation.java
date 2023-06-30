package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class EndSituation {
    @JsonProperty("yfd")
    private Integer yfd;

    @JsonProperty("possession")
    private Possession possession;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("down")
    private Integer down;

    public Optional<Integer> getYfd() {
        return Optional.ofNullable(yfd);
    }

    public Optional<Possession> getPossession() {
        return Optional.ofNullable(possession);
    }

    public Optional<Location> getLocation() {
        return Optional.ofNullable(location);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<Integer> getDown() {
        return Optional.ofNullable(down);
    }
}
