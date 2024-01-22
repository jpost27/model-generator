package com.fanduel.modelgenerator.generated.nbav7.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
public class PlayByPlayResponse {
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

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("deleted_events")
    private List<DeletedEvent> deletedEvents;

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

    public List<Period> getPeriods() {
        return Optional.ofNullable(periods).orElse(Collections.emptyList());
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

    public List<DeletedEvent> getDeletedEvents() {
        return Optional.ofNullable(deletedEvents).orElse(Collections.emptyList());
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
