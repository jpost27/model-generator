package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

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

    @JsonProperty("ps_game")
    private String psGame;

    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("double_header")
    private Boolean doubleHeader;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("away_team")
    private String awayTeam;

    @JsonProperty("ps_round")
    private String psRound;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("day_night")
    private String dayNight;

    @JsonProperty("game_number")
    private Integer gameNumber;

    @JsonProperty("innings")
    private List<Inning> innings;

    @JsonProperty("home_team")
    private String homeTeam;

    @JsonProperty("id")
    private String id;

    @JsonProperty("deleted_events")
    private List<DeletedEvent> deletedEvents;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<String> getPsGame() {
        return Optional.ofNullable(psGame);
    }

    public Optional<Broadcast> getBroadcast() {
        return Optional.ofNullable(broadcast);
    }

    public Optional<Boolean> getDoubleHeader() {
        return Optional.ofNullable(doubleHeader);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Scoring> getScoring() {
        return Optional.ofNullable(scoring);
    }

    public Optional<String> getAwayTeam() {
        return Optional.ofNullable(awayTeam);
    }

    public Optional<String> getPsRound() {
        return Optional.ofNullable(psRound);
    }

    public Optional<String> getScheduled() {
        return Optional.ofNullable(scheduled);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getDayNight() {
        return Optional.ofNullable(dayNight);
    }

    public Optional<Integer> getGameNumber() {
        return Optional.ofNullable(gameNumber);
    }

    public List<Inning> getInnings() {
        return Optional.ofNullable(innings).orElse(Collections.emptyList());
    }

    public Optional<String> getHomeTeam() {
        return Optional.ofNullable(homeTeam);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<DeletedEvent> getDeletedEvents() {
        return Optional.ofNullable(deletedEvents).orElse(Collections.emptyList());
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
