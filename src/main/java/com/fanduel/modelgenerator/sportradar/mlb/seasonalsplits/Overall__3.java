
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
public class Overall__3 {

    @JsonProperty("total")
    public List<Total__5> total = new ArrayList<Total__5>();
    @JsonProperty("day_night")
    public List<DayNight__5> dayNight = new ArrayList<DayNight__5>();
    @JsonProperty("venue")
    public List<Venue__5> venue = new ArrayList<Venue__5>();
    @JsonProperty("surface")
    public List<Surface__5> surface = new ArrayList<Surface__5>();
    @JsonProperty("month")
    public List<Month__5> month = new ArrayList<Month__5>();
    @JsonProperty("home_away")
    public List<HomeAway__5> homeAway = new ArrayList<HomeAway__5>();
    @JsonProperty("hitter_hand")
    public List<HitterHand__3> hitterHand = new ArrayList<HitterHand__3>();
    @JsonProperty("opponent")
    public List<Opponent__5> opponent = new ArrayList<Opponent__5>();

}
