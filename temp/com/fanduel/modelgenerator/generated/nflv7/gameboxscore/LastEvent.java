package com.fanduel.modelgenerator.generated.nflv7.gameboxscore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class LastEvent {
    @JsonProperty("sequence")
    private Double sequence;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("description")
    private String description;

    @JsonProperty("id")
    private String id;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("type")
    private String type;

    @JsonProperty("updated_at")
    private String updatedAt;

    public Optional<Double> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<String> getWallClock() {
        return Optional.ofNullable(wallClock);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getEventType() {
        return Optional.ofNullable(eventType);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }
}
