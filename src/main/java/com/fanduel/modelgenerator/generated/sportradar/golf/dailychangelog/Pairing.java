package com.fanduel.modelgenerator.generated.sportradar.golf.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("tee_time")
    private String teeTime;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified")
    private String lastModified;

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<String> getTeeTime() {
        return Optional.ofNullable(teeTime);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getLastModified() {
        return Optional.ofNullable(lastModified);
    }
}
