package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
    @JsonProperty("games_started")
    private Integer gamesStarted;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("passing")
    private Passing passing;

    public Optional<Integer> getGamesStarted() {
        return Optional.ofNullable(gamesStarted);
    }

    public Optional<Receiving> getReceiving() {
        return Optional.ofNullable(receiving);
    }

    public Optional<Conversions> getConversions() {
        return Optional.ofNullable(conversions);
    }

    public Optional<Penalties> getPenalties() {
        return Optional.ofNullable(penalties);
    }

    public Optional<Integer> getGamesPlayed() {
        return Optional.ofNullable(gamesPlayed);
    }

    public Optional<Fumbles> getFumbles() {
        return Optional.ofNullable(fumbles);
    }

    public Optional<Rushing> getRushing() {
        return Optional.ofNullable(rushing);
    }

    public Optional<Passing> getPassing() {
        return Optional.ofNullable(passing);
    }
}
