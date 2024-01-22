package com.fanduel.modelgenerator.generated.nflv7.currentseasonschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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
public class Game {
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

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("conference_game")
    private Boolean conferenceGame;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("duration")
    private String duration;

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

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Boolean> getConferenceGame() {
        return Optional.ofNullable(conferenceGame);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
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
