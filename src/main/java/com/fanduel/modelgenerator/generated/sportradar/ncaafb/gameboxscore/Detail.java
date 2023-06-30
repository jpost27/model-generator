package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gameboxscore;

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
public class Detail {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("start_location")
    private StartLocation startLocation;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("penalty")
    private Penalty penalty;

    @JsonProperty("category")
    private String category;

    @JsonProperty("end_location")
    private EndLocation endLocation;

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<StartLocation> getStartLocation() {
        return Optional.ofNullable(startLocation);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<Penalty> getPenalty() {
        return Optional.ofNullable(penalty);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<EndLocation> getEndLocation() {
        return Optional.ofNullable(endLocation);
    }
}
