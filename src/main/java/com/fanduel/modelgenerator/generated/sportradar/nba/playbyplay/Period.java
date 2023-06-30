package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Period {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("events")
    private List<Event> events;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Scoring> getScoring() {
        return Optional.ofNullable(scoring);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public List<Event> getEvents() {
        return Optional.ofNullable(events).orElse(Collections.emptyList());
    }
}
