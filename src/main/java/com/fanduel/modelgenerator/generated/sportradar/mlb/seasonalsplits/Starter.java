package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Starter {
    @JsonProperty("venue")
    private List<Venue> venue;

    @JsonProperty("home_away")
    private List<HomeAway> homeAway;

    @JsonProperty("total")
    private List<Total> total;

    @JsonProperty("day_night")
    private List<DayNight> dayNight;

    @JsonProperty("surface")
    private List<Surface> surface;

    @JsonProperty("month")
    private List<Month> month;

    @JsonProperty("opponent")
    private List<Opponent> opponent;

    @JsonProperty("hitter_hand")
    private List<HitterHand> hitterHand;
}
