package com.fanduel.modelgenerator.generated.nflv7.playerprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Statistics {
    @JsonProperty("games_started")
    private Integer gamesStarted;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("passing")
    private Passing passing;

    public Optional<Integer> getGamesStarted() {
        return Optional.ofNullable(gamesStarted);
    }

    public Optional<Receiving> getReceiving() {
        return Optional.ofNullable(receiving);
    }

    public Optional<KickReturns> getKickReturns() {
        return Optional.ofNullable(kickReturns);
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

    public Optional<Defense> getDefense() {
        return Optional.ofNullable(defense);
    }

    public Optional<Fumbles> getFumbles() {
        return Optional.ofNullable(fumbles);
    }

    public Optional<Rushing> getRushing() {
        return Optional.ofNullable(rushing);
    }

    public Optional<PuntReturns> getPuntReturns() {
        return Optional.ofNullable(puntReturns);
    }

    public Optional<Passing> getPassing() {
        return Optional.ofNullable(passing);
    }
}
