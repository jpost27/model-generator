
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

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
public class Away__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("summary")
    public Summary__2 summary;
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
    @JsonProperty("misc_returns")
    public MiscReturns__1 miscReturns;
    @JsonProperty("kickoffs")
    public Kickoffs__1 kickoffs;
    @JsonProperty("kick_returns")
    public KickReturns__1 kickReturns;
    @JsonProperty("int_returns")
    public IntReturns__1 intReturns;
    @JsonProperty("fumbles")
    public Fumbles__1 fumbles;
    @JsonProperty("field_goals")
    public FieldGoals__1 fieldGoals;
    @JsonProperty("defense")
    public Defense__1 defense;
    @JsonProperty("extra_points")
    public ExtraPoints__1 extraPoints;
    @JsonProperty("first_downs")
    public FirstDowns__1 firstDowns;
    @JsonProperty("interceptions")
    public Interceptions__1 interceptions;
    @JsonProperty("touchdowns")
    public Touchdowns__1 touchdowns;
    @JsonProperty("efficiency")
    public Efficiency__1 efficiency;

}
