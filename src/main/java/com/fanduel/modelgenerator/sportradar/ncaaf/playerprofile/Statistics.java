
package com.fanduel.modelgenerator.sportradar.ncaaf.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "games_played",
    "games_started",
    "rushing",
    "penalties",
    "passing",
    "fumbles",
    "conversions",
    "receiving"
})
@Generated("jsonschema2pojo")
public class Statistics {

    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("games_started")
    public Integer gamesStarted;
    @JsonProperty("rushing")
    public Rushing rushing;
    @JsonProperty("penalties")
    public Penalties penalties;
    @JsonProperty("passing")
    public Passing passing;
    @JsonProperty("fumbles")
    public Fumbles fumbles;
    @JsonProperty("conversions")
    public Conversions conversions;
    @JsonProperty("receiving")
    public Receiving receiving;

}
