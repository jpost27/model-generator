
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
public class Opponents {

    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("touchdowns")
    public Touchdowns__1 touchdowns;
    @JsonProperty("rushing")
    public Rushing__1 rushing;
    @JsonProperty("receiving")
    public Receiving__1 receiving;
    @JsonProperty("punts")
    public Punts__1 punts;
    @JsonProperty("punt_returns")
    public PuntReturns__1 puntReturns;
    @JsonProperty("penalties")
    public Penalties__1 penalties;
    @JsonProperty("passing")
    public Passing__1 passing;
    @JsonProperty("kickoffs")
    public Kickoffs__1 kickoffs;
    @JsonProperty("kick_returns")
    public KickReturns__1 kickReturns;
    @JsonProperty("interceptions")
    public Interceptions__1 interceptions;
    @JsonProperty("int_returns")
    public IntReturns__1 intReturns;
    @JsonProperty("fumbles")
    public Fumbles__1 fumbles;
    @JsonProperty("first_downs")
    public FirstDowns__1 firstDowns;
    @JsonProperty("field_goals")
    public FieldGoals__1 fieldGoals;
    @JsonProperty("defense")
    public Defense__1 defense;
    @JsonProperty("extra_points")
    public ExtraPoints__1 extraPoints;
    @JsonProperty("efficiency")
    public Efficiency__1 efficiency;

}
