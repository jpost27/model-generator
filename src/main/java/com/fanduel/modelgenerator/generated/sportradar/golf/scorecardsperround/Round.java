package com.fanduel.modelgenerator.generated.sportradar.golf.scorecardsperround;

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
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
