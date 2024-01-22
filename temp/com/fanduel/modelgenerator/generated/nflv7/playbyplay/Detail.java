package com.fanduel.modelgenerator.generated.nflv7.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Detail {
    @JsonProperty("result")
    private String result;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("start_location")
    private StartLocation startLocation;

    @JsonProperty("penalty")
    private Penalty penalty;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("review")
    private Review review;

    @JsonProperty("description")
    private String description;

    @JsonProperty("recovery")
    private Recovery recovery;

    @JsonProperty("category")
    private String category;

    @JsonProperty("end_location")
    private EndLocation endLocation;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("direction")
    private String direction;

    public Optional<String> getResult() {
        return Optional.ofNullable(result);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<StartLocation> getStartLocation() {
        return Optional.ofNullable(startLocation);
    }

    public Optional<Penalty> getPenalty() {
        return Optional.ofNullable(penalty);
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<Review> getReview() {
        return Optional.ofNullable(review);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Recovery> getRecovery() {
        return Optional.ofNullable(recovery);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<EndLocation> getEndLocation() {
        return Optional.ofNullable(endLocation);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<String> getDirection() {
        return Optional.ofNullable(direction);
    }
}
