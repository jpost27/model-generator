
package com.fanduel.modelgenerator.sportradar.nba.seriesschedule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "title",
    "coverage",
    "scheduled",
    "home_points",
    "away_points",
    "neutral_site",
    "track_on_court",
    "sr_id",
    "reference",
    "time_zones",
    "venue",
    "broadcasts",
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Game {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("title")
    public String title;
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("neutral_site")
    public Boolean neutralSite;
    @JsonProperty("track_on_court")
    public Boolean trackOnCourt;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("time_zones")
    public TimeZones timeZones;
    @JsonProperty("venue")
    public Venue venue;
    @JsonProperty("broadcasts")
    public List<Broadcast> broadcasts = new ArrayList<Broadcast>();
    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;

}
