package com.fanduel.modelgenerator.generated.sportradar.nba.nbaapiv7simulations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Game {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("track_on_court")
    private Boolean trackOnCourt;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    @JsonProperty("home")
    private Home home;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Boolean> getTrackOnCourt() {
        return Optional.ofNullable(trackOnCourt);
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }
}
