package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
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
    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("conference_game")
    private Boolean conferenceGame;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("id")
    private String id;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    public Optional<Broadcast> getBroadcast() {
        return Optional.ofNullable(broadcast);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Scoring> getScoring() {
        return Optional.ofNullable(scoring);
    }

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Boolean> getConferenceGame() {
        return Optional.ofNullable(conferenceGame);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getAttendance() {
        return Optional.ofNullable(attendance);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getEntryMode() {
        return Optional.ofNullable(entryMode);
    }
}
