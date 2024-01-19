package com.fanduel.modelgenerator.generated.sportradar.golf.playerprofilelive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
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
public class Leaderboard {
    @JsonProperty("score")
    private Integer score;

    @JsonProperty("tied")
    private Boolean tied;

    @JsonProperty("strokes")
    private Integer strokes;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("rounds")
    private List<Round> rounds;

    public Optional<Integer> getScore() {
        return Optional.ofNullable(score);
    }

    public Optional<Boolean> getTied() {
        return Optional.ofNullable(tied);
    }

    public Optional<Integer> getStrokes() {
        return Optional.ofNullable(strokes);
    }

    public Optional<Integer> getPosition() {
        return Optional.ofNullable(position);
    }

    public List<Round> getRounds() {
        return Optional.ofNullable(rounds).orElse(Collections.emptyList());
    }
}
