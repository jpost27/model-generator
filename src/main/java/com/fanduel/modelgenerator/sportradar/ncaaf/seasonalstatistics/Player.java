
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "position",
    "games_played",
    "games_started",
    "rushing",
    "receiving",
    "kick_returns",
    "penalties",
    "int_returns",
    "defense",
    "fumbles",
    "punts",
    "punt_returns",
    "kickoffs",
    "field_goals",
    "extra_points",
    "passing"
})
@Generated("jsonschema2pojo")
public class Player {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("games_started")
    public Integer gamesStarted;
    @JsonProperty("rushing")
    public Rushing__2 rushing;
    @JsonProperty("receiving")
    public Receiving__2 receiving;
    @JsonProperty("kick_returns")
    public KickReturns__2 kickReturns;
    @JsonProperty("penalties")
    public Penalties__2 penalties;
    @JsonProperty("int_returns")
    public IntReturns__2 intReturns;
    @JsonProperty("defense")
    public Defense__2 defense;
    @JsonProperty("fumbles")
    public Fumbles__2 fumbles;
    @JsonProperty("punts")
    public Punts__2 punts;
    @JsonProperty("punt_returns")
    public PuntReturns__2 puntReturns;
    @JsonProperty("kickoffs")
    public Kickoffs__2 kickoffs;
    @JsonProperty("field_goals")
    public FieldGoals__2 fieldGoals;
    @JsonProperty("extra_points")
    public ExtraPoints__2 extraPoints;
    @JsonProperty("passing")
    public Passing__2 passing;

}
