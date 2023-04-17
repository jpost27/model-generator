package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
