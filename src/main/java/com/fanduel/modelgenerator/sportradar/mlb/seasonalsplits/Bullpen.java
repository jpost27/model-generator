
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
public class Bullpen {

    @JsonProperty("total")
    public List<Total__2> total = new ArrayList<Total__2>();
    @JsonProperty("day_night")
    public List<DayNight__2> dayNight = new ArrayList<DayNight__2>();
    @JsonProperty("venue")
    public List<Venue__2> venue = new ArrayList<Venue__2>();
    @JsonProperty("surface")
    public List<Surface__2> surface = new ArrayList<Surface__2>();
    @JsonProperty("month")
    public List<Month__2> month = new ArrayList<Month__2>();
    @JsonProperty("home_away")
    public List<HomeAway__2> homeAway = new ArrayList<HomeAway__2>();
    @JsonProperty("hitter_hand")
    public List<HitterHand__1> hitterHand = new ArrayList<HitterHand__1>();
    @JsonProperty("opponent")
    public List<Opponent__2> opponent = new ArrayList<Opponent__2>();

}
