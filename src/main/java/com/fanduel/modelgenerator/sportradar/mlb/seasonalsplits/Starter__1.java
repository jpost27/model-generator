
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
public class Starter__1 {

    @JsonProperty("total")
    public List<Total__7> total = new ArrayList<Total__7>();
    @JsonProperty("day_night")
    public List<DayNight__7> dayNight = new ArrayList<DayNight__7>();
    @JsonProperty("venue")
    public List<Venue__7> venue = new ArrayList<Venue__7>();
    @JsonProperty("surface")
    public List<Surface__7> surface = new ArrayList<Surface__7>();
    @JsonProperty("month")
    public List<Month__7> month = new ArrayList<Month__7>();
    @JsonProperty("home_away")
    public List<HomeAway__7> homeAway = new ArrayList<HomeAway__7>();
    @JsonProperty("hitter_hand")
    public List<HitterHand__5> hitterHand = new ArrayList<HitterHand__5>();
    @JsonProperty("opponent")
    public List<Opponent__7> opponent = new ArrayList<Opponent__7>();

}
