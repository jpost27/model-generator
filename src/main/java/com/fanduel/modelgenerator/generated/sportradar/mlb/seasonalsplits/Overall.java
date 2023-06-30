package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Overall {
    @JsonProperty("venue")
    private List<Venue> venue;

    @JsonProperty("home_away")
    private List<HomeAway> homeAway;

    @JsonProperty("total")
    private List<Total> total;

    @JsonProperty("pitcher_hand")
    private List<PitcherHand> pitcherHand;

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

    public List<Venue> getVenue() {
        return Optional.ofNullable(venue).orElse(Collections.emptyList());
    }

    public List<HomeAway> getHomeAway() {
        return Optional.ofNullable(homeAway).orElse(Collections.emptyList());
    }

    public List<Total> getTotal() {
        return Optional.ofNullable(total).orElse(Collections.emptyList());
    }

    public List<PitcherHand> getPitcherHand() {
        return Optional.ofNullable(pitcherHand).orElse(Collections.emptyList());
    }

    public List<DayNight> getDayNight() {
        return Optional.ofNullable(dayNight).orElse(Collections.emptyList());
    }

    public List<Surface> getSurface() {
        return Optional.ofNullable(surface).orElse(Collections.emptyList());
    }

    public List<Month> getMonth() {
        return Optional.ofNullable(month).orElse(Collections.emptyList());
    }

    public List<Opponent> getOpponent() {
        return Optional.ofNullable(opponent).orElse(Collections.emptyList());
    }

    public List<HitterHand> getHitterHand() {
        return Optional.ofNullable(hitterHand).orElse(Collections.emptyList());
    }
}
