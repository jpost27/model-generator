
package com.fanduel.modelgenerator.sportradar.nba.nbaapiv8simulations;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "coverage",
    "scheduled",
    "home_points",
    "away_points",
    "track_on_court",
    "reference",
    "venue",
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Game {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("track_on_court")
    public Boolean trackOnCourt;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;

}
