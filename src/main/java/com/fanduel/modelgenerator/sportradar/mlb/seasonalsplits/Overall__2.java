
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

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
    "opponent",
    "pitcher_hand"
})
@Generated("jsonschema2pojo")
public class Overall__2 {

    @JsonProperty("total")
    public List<Total__4> total = new ArrayList<Total__4>();
    @JsonProperty("day_night")
    public List<DayNight__4> dayNight = new ArrayList<DayNight__4>();
    @JsonProperty("venue")
    public List<Venue__4> venue = new ArrayList<Venue__4>();
    @JsonProperty("surface")
    public List<Surface__4> surface = new ArrayList<Surface__4>();
    @JsonProperty("month")
    public List<Month__4> month = new ArrayList<Month__4>();
    @JsonProperty("home_away")
    public List<HomeAway__4> homeAway = new ArrayList<HomeAway__4>();
    @JsonProperty("opponent")
    public List<Opponent__4> opponent = new ArrayList<Opponent__4>();
    @JsonProperty("pitcher_hand")
    public List<PitcherHand__1> pitcherHand = new ArrayList<PitcherHand__1>();

}
