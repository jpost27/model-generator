package com.fanduel.modelgenerator.generated.sportradar.nba.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
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
public class Rank {
    @JsonProperty("score")
    private Double score;

    @JsonProperty("average")
    private Average average;

    @JsonProperty("tied")
    private Boolean tied;

    @JsonProperty("total")
    private Total total;

    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("player")
    private Player player;

    public Optional<Double> getScore() {
        return Optional.ofNullable(score);
    }

    public Optional<Average> getAverage() {
        return Optional.ofNullable(average);
    }

    public Optional<Boolean> getTied() {
        return Optional.ofNullable(tied);
    }

    public Optional<Total> getTotal() {
        return Optional.ofNullable(total);
    }

    public List<Team> getTeams() {
        return Optional.ofNullable(teams).orElse(Collections.emptyList());
    }

    public Optional<Integer> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(player);
    }
}
