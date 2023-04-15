
package com.fanduel.modelgenerator.sportradar.nfl.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "games_played",
    "games_started",
    "rushing",
    "receiving",
    "punt_returns",
    "fumbles",
    "penalties",
    "passing",
    "defense",
    "conversions",
    "kick_returns"
})
@Generated("jsonschema2pojo")
public class Statistics {

    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("games_started")
    public Integer gamesStarted;
    @JsonProperty("rushing")
    public Rushing rushing;
    @JsonProperty("receiving")
    public Receiving receiving;
    @JsonProperty("punt_returns")
    public PuntReturns puntReturns;
    @JsonProperty("fumbles")
    public Fumbles fumbles;
    @JsonProperty("penalties")
    public Penalties penalties;
    @JsonProperty("passing")
    public Passing passing;
    @JsonProperty("defense")
    public Defense defense;
    @JsonProperty("conversions")
    public Conversions conversions;
    @JsonProperty("kick_returns")
    public KickReturns kickReturns;

}
