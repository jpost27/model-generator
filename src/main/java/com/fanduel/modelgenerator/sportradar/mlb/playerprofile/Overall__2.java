
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
public class Overall__2 {

    @JsonProperty("total")
    public List<Total> total = new ArrayList<Total>();
    @JsonProperty("day_night")
    public List<DayNight> dayNight = new ArrayList<DayNight>();
    @JsonProperty("venue")
    public List<Venue> venue = new ArrayList<Venue>();
    @JsonProperty("surface")
    public List<Surface> surface = new ArrayList<Surface>();
    @JsonProperty("month")
    public List<Month> month = new ArrayList<Month>();
    @JsonProperty("home_away")
    public List<HomeAway> homeAway = new ArrayList<HomeAway>();
    @JsonProperty("pitcher_hand")
    public List<PitcherHand> pitcherHand = new ArrayList<PitcherHand>();
    @JsonProperty("opponent")
    public List<Opponent> opponent = new ArrayList<Opponent>();

}
