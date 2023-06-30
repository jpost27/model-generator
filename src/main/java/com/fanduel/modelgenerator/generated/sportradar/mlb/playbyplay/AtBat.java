package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

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
public class AtBat {
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("pitcher_hand")
    private String pitcherHand;

    @JsonProperty("hitter_id")
    private String hitterId;

    @JsonProperty("hitter")
    private Hitter hitter;

    @JsonProperty("hitter_hand")
    private String hitterHand;

    @JsonProperty("description")
    private String description;

    @JsonProperty("pitcher")
    private Pitcher pitcher;

    @JsonProperty("id")
    private String id;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("pitcher_id")
    private String pitcherId;

    public Optional<Integer> getSequenceNumber() {
        return Optional.ofNullable(sequenceNumber);
    }

    public Optional<String> getPitcherHand() {
        return Optional.ofNullable(pitcherHand);
    }

    public Optional<String> getHitterId() {
        return Optional.ofNullable(hitterId);
    }

    public Optional<Hitter> getHitter() {
        return Optional.ofNullable(hitter);
    }

    public Optional<String> getHitterHand() {
        return Optional.ofNullable(hitterHand);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Pitcher> getPitcher() {
        return Optional.ofNullable(pitcher);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public List<Event> getEvents() {
        return Optional.ofNullable(events).orElse(Collections.emptyList());
    }

    public Optional<String> getPitcherId() {
        return Optional.ofNullable(pitcherId);
    }
}
