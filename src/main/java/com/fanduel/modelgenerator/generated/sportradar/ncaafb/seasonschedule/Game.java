package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonschedule;

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
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("game_type")
    private String gameType;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("title")
    private String title;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("conference_game")
    private Boolean conferenceGame;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("id")
    private String id;

    @JsonProperty("neutral_site")
    private Boolean neutralSite;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<Broadcast> getBroadcast() {
        return Optional.ofNullable(broadcast);
    }

    public Optional<String> getGameType() {
        return Optional.ofNullable(gameType);
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

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<Boolean> getConferenceGame() {
        return Optional.ofNullable(conferenceGame);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Boolean> getNeutralSite() {
        return Optional.ofNullable(neutralSite);
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
