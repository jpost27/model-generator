
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "games_played",
    "touchdowns",
    "rushing",
    "receiving",
    "punts",
    "punt_returns",
    "penalties",
    "passing",
    "misc_returns",
    "kickoffs",
    "kick_returns",
    "interceptions",
    "int_returns",
    "fumbles",
    "first_downs",
    "field_goals",
    "defense",
    "extra_points",
    "efficiency"
})
@Generated("jsonschema2pojo")
public class Record {

    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("touchdowns")
    public Touchdowns touchdowns;
    @JsonProperty("rushing")
    public Rushing rushing;
    @JsonProperty("receiving")
    public Receiving receiving;
    @JsonProperty("punts")
    public Punts punts;
    @JsonProperty("punt_returns")
    public PuntReturns puntReturns;
    @JsonProperty("penalties")
    public Penalties penalties;
    @JsonProperty("passing")
    public Passing passing;
    @JsonProperty("misc_returns")
    public MiscReturns miscReturns;
    @JsonProperty("kickoffs")
    public Kickoffs kickoffs;
    @JsonProperty("kick_returns")
    public KickReturns kickReturns;
    @JsonProperty("interceptions")
    public Interceptions interceptions;
    @JsonProperty("int_returns")
    public IntReturns intReturns;
    @JsonProperty("fumbles")
    public Fumbles fumbles;
    @JsonProperty("first_downs")
    public FirstDowns firstDowns;
    @JsonProperty("field_goals")
    public FieldGoals fieldGoals;
    @JsonProperty("defense")
    public Defense defense;
    @JsonProperty("extra_points")
    public ExtraPoints extraPoints;
    @JsonProperty("efficiency")
    public Efficiency efficiency;

}
