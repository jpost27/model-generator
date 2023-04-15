
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
public class Bullpen__1 {

    @JsonProperty("total")
    public List<Total__6> total = new ArrayList<Total__6>();
    @JsonProperty("day_night")
    public List<DayNight__6> dayNight = new ArrayList<DayNight__6>();
    @JsonProperty("venue")
    public List<Venue__6> venue = new ArrayList<Venue__6>();
    @JsonProperty("surface")
    public List<Surface__6> surface = new ArrayList<Surface__6>();
    @JsonProperty("month")
    public List<Month__6> month = new ArrayList<Month__6>();
    @JsonProperty("home_away")
    public List<HomeAway__6> homeAway = new ArrayList<HomeAway__6>();
    @JsonProperty("hitter_hand")
    public List<HitterHand__4> hitterHand = new ArrayList<HitterHand__4>();
    @JsonProperty("opponent")
    public List<Opponent__6> opponent = new ArrayList<Opponent__6>();

}
