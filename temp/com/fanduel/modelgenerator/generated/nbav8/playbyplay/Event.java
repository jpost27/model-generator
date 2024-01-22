package com.fanduel.modelgenerator.generated.nbav8.playbyplay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.Long;
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
public class Event {
    @JsonProperty("on_court")
    private OnCourt onCourt;

    @JsonProperty("turnover_type")
    private String turnoverType;

    @JsonProperty("clock_decimal")
    private String clockDecimal;

    @JsonProperty("possession")
    private Possession possession;

    @JsonProperty("description")
    private String description;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("qualifiers")
    private List<Qualifier> qualifiers;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("attempt")
    private String attempt;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("sequence")
    private Long sequence;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("attribution")
    private Attribution attribution;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("id")
    private String id;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("statistics")
    private List<Statistic> statistics;

    public Optional<OnCourt> getOnCourt() {
        return Optional.ofNullable(onCourt);
    }

    public Optional<String> getTurnoverType() {
        return Optional.ofNullable(turnoverType);
    }

    public Optional<String> getClockDecimal() {
        return Optional.ofNullable(clockDecimal);
    }

    public Optional<Possession> getPossession() {
        return Optional.ofNullable(possession);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public List<Qualifier> getQualifiers() {
        return Optional.ofNullable(qualifiers).orElse(Collections.emptyList());
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getEventType() {
        return Optional.ofNullable(eventType);
    }

    public Optional<String> getAttempt() {
        return Optional.ofNullable(attempt);
    }

    public Optional<Integer> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<Long> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<String> getWallClock() {
        return Optional.ofNullable(wallClock);
    }

    public Optional<Attribution> getAttribution() {
        return Optional.ofNullable(attribution);
    }

    public Optional<Location> getLocation() {
        return Optional.ofNullable(location);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getUpdated() {
        return Optional.ofNullable(updated);
    }

    public List<Statistic> getStatistics() {
        return Optional.ofNullable(statistics).orElse(Collections.emptyList());
    }
}
