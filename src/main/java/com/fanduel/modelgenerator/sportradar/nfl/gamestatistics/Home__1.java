
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "alias",
    "sr_id",
    "summary",
    "rushing",
    "receiving",
    "punts",
    "punt_returns",
    "penalties",
    "passing",
    "misc_returns",
    "kickoffs",
    "kick_returns",
    "int_returns",
    "fumbles",
    "field_goals",
    "defense",
    "extra_points",
    "first_downs",
    "interceptions",
    "touchdowns",
    "efficiency"
})
@Generated("jsonschema2pojo")
public class Home__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("summary")
    public Summary__1 summary;
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
    @JsonProperty("int_returns")
    public IntReturns intReturns;
    @JsonProperty("fumbles")
    public Fumbles fumbles;
    @JsonProperty("field_goals")
    public FieldGoals fieldGoals;
    @JsonProperty("defense")
    public Defense defense;
    @JsonProperty("extra_points")
    public ExtraPoints extraPoints;
    @JsonProperty("first_downs")
    public FirstDowns firstDowns;
    @JsonProperty("interceptions")
    public Interceptions interceptions;
    @JsonProperty("touchdowns")
    public Touchdowns touchdowns;
    @JsonProperty("efficiency")
    public Efficiency efficiency;

}
