
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "clock",
    "updated",
    "description",
    "wall_clock",
    "sequence",
    "home_points",
    "away_points",
    "clock_decimal",
    "number",
    "event_type",
    "attribution",
    "on_court",
    "possession",
    "qualifiers",
    "location",
    "statistics",
    "attempt",
    "turnover_type",
    "duration"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("id")
    public String id;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("updated")
    public String updated;
    @JsonProperty("description")
    public String description;
    @JsonProperty("wall_clock")
    public String wallClock;
    @JsonProperty("sequence")
    public Long sequence;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("clock_decimal")
    public String clockDecimal;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("event_type")
    public String eventType;
    @JsonProperty("attribution")
    public Attribution attribution;
    @JsonProperty("on_court")
    public OnCourt onCourt;
    @JsonProperty("possession")
    public Possession possession;
    @JsonProperty("qualifiers")
    public List<Qualifier> qualifiers = new ArrayList<Qualifier>();
    @JsonProperty("location")
    public Location location;
    @JsonProperty("statistics")
    public List<Statistic> statistics = new ArrayList<Statistic>();
    @JsonProperty("attempt")
    public String attempt;
    @JsonProperty("turnover_type")
    public String turnoverType;
    @JsonProperty("duration")
    public Integer duration;

}
