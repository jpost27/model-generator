package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
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
public class Pbp {
    @JsonProperty("end_reason")
    private String endReason;

    @JsonProperty("inside_20")
    private Boolean inside20;

    @JsonProperty("description")
    private String description;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("type")
    private String type;

    @JsonProperty("gain")
    private Integer gain;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("sequence")
    private Double sequence;

    @JsonProperty("play_count")
    private Integer playCount;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("start_reason")
    private String startReason;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("scoring_drive")
    private Boolean scoringDrive;

    @JsonProperty("id")
    private String id;

    @JsonProperty("alt_description")
    private String altDescription;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("penalty_yards")
    private Integer penaltyYards;

    @JsonProperty("updated_at")
    private String updatedAt;

    public Optional<String> getEndReason() {
        return Optional.ofNullable(endReason);
    }

    public Optional<Boolean> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getEventType() {
        return Optional.ofNullable(eventType);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<Integer> getGain() {
        return Optional.ofNullable(gain);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<Double> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getPlayCount() {
        return Optional.ofNullable(playCount);
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<String> getStartReason() {
        return Optional.ofNullable(startReason);
    }

    public Optional<String> getWallClock() {
        return Optional.ofNullable(wallClock);
    }

    public Optional<Boolean> getScoringDrive() {
        return Optional.ofNullable(scoringDrive);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAltDescription() {
        return Optional.ofNullable(altDescription);
    }

    public List<Event> getEvents() {
        return Optional.ofNullable(events).orElse(Collections.emptyList());
    }

    public Optional<Integer> getPenaltyYards() {
        return Optional.ofNullable(penaltyYards);
    }

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }
}
