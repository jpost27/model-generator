
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

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
    "sr_id",
    "games_played",
    "games_started",
    "receiving",
    "penalties",
    "defense",
    "int_returns",
    "fumbles",
    "rushing",
    "misc_returns",
    "kick_returns",
    "passing",
    "punt_returns",
    "kickoffs",
    "extra_points",
    "punts",
    "field_goals",
    "conversions"
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
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("games_played")
    public Integer gamesPlayed;
    @JsonProperty("games_started")
    public Integer gamesStarted;
    @JsonProperty("receiving")
    public Receiving__2 receiving;
    @JsonProperty("penalties")
    public Penalties__2 penalties;
    @JsonProperty("defense")
    public Defense__2 defense;
    @JsonProperty("int_returns")
    public IntReturns__2 intReturns;
    @JsonProperty("fumbles")
    public Fumbles__2 fumbles;
    @JsonProperty("rushing")
    public Rushing__2 rushing;
    @JsonProperty("misc_returns")
    public MiscReturns__1 miscReturns;
    @JsonProperty("kick_returns")
    public KickReturns__2 kickReturns;
    @JsonProperty("passing")
    public Passing__2 passing;
    @JsonProperty("punt_returns")
    public PuntReturns__2 puntReturns;
    @JsonProperty("kickoffs")
    public Kickoffs__2 kickoffs;
    @JsonProperty("extra_points")
    public ExtraPoints__2 extraPoints;
    @JsonProperty("punts")
    public Punts__2 punts;
    @JsonProperty("field_goals")
    public FieldGoals__2 fieldGoals;
    @JsonProperty("conversions")
    public Conversions__2 conversions;

}
