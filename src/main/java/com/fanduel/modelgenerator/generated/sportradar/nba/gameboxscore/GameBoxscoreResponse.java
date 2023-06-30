package com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore;

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
public class GameBoxscoreResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("times_tied")
    private Integer timesTied;

    @JsonProperty("clock_decimal")
    private String clockDecimal;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("track_on_court")
    private Boolean trackOnCourt;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("quarter")
    private Integer quarter;

    @JsonProperty("entry_mode")
    private String entryMode;

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public Optional<Integer> getTimesTied() {
        return Optional.ofNullable(timesTied);
    }

    public Optional<String> getClockDecimal() {
        return Optional.ofNullable(clockDecimal);
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

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getLeadChanges() {
        return Optional.ofNullable(leadChanges);
    }

    public Optional<TimeZones> getTimeZones() {
        return Optional.ofNullable(timeZones);
    }

    public Optional<Integer> getAttendance() {
        return Optional.ofNullable(attendance);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<Integer> getQuarter() {
        return Optional.ofNullable(quarter);
    }

    public Optional<String> getEntryMode() {
        return Optional.ofNullable(entryMode);
    }
}
