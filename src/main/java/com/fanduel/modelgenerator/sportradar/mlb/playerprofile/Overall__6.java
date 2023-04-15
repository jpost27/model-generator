
package com.fanduel.modelgenerator.sportradar.mlb.playerprofile;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "day_night",
    "venue",
    "surface",
    "month",
    "home_away",
    "pitcher_hand",
    "opponent"
})
@Generated("jsonschema2pojo")
public class Overall__6 {

    @JsonProperty("total")
    public List<Total__1> total = new ArrayList<Total__1>();
    @JsonProperty("day_night")
    public List<DayNight__1> dayNight = new ArrayList<DayNight__1>();
    @JsonProperty("venue")
    public List<Venue__1> venue = new ArrayList<Venue__1>();
    @JsonProperty("surface")
    public List<Surface__1> surface = new ArrayList<Surface__1>();
    @JsonProperty("month")
    public List<Month__1> month = new ArrayList<Month__1>();
    @JsonProperty("home_away")
    public List<HomeAway__1> homeAway = new ArrayList<HomeAway__1>();
    @JsonProperty("pitcher_hand")
    public List<PitcherHand__1> pitcherHand = new ArrayList<PitcherHand__1>();
    @JsonProperty("opponent")
    public List<Opponent__1> opponent = new ArrayList<Opponent__1>();

}
