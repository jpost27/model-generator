package com.fanduel.modelgenerator.generated.sportradar.nba.playintournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("track_on_court")
    private Boolean trackOnCourt;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("broadcasts")
    private List<Broadcast> broadcasts;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("title")
    private String title;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("id")
    private String id;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("status")
    private String status;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
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

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public List<Broadcast> getBroadcasts() {
        return Optional.ofNullable(broadcasts).orElse(Collections.emptyList());
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<TimeZones> getTimeZones() {
        return Optional.ofNullable(timeZones);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
