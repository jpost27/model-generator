package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Summary {
    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("week")
    private Week week;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("home")
    private Home home;

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Week> getWeek() {
        return Optional.ofNullable(week);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }
}
