package com.fanduel.modelgenerator.generated.nflv7.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
