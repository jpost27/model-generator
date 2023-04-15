
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
    "hitter_hand",
    "opponent"
})
@Generated("jsonschema2pojo")
public class Starter {

    @JsonProperty("total")
    public List<Total__3> total = new ArrayList<Total__3>();
    @JsonProperty("day_night")
    public List<DayNight__3> dayNight = new ArrayList<DayNight__3>();
    @JsonProperty("venue")
    public List<Venue__3> venue = new ArrayList<Venue__3>();
    @JsonProperty("surface")
    public List<Surface__3> surface = new ArrayList<Surface__3>();
    @JsonProperty("month")
    public List<Month__3> month = new ArrayList<Month__3>();
    @JsonProperty("home_away")
    public List<HomeAway__3> homeAway = new ArrayList<HomeAway__3>();
    @JsonProperty("hitter_hand")
    public List<HitterHand__2> hitterHand = new ArrayList<HitterHand__2>();
    @JsonProperty("opponent")
    public List<Opponent__3> opponent = new ArrayList<Opponent__3>();

}
