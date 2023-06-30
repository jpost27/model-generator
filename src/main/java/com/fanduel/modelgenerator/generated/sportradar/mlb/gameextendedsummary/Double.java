package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

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
public class Double {
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("flags")
    private Flags flags;

    @JsonProperty("count")
    private Count count;

    @JsonProperty("outcome_id")
    private String outcomeId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("hit_type")
    private String hitType;

    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    @JsonProperty("hitter")
    private Hitter hitter;

    @JsonProperty("pitcher")
    private Pitcher pitcher;

    @JsonProperty("id")
    private String id;

    @JsonProperty("hit_location")
    private String hitLocation;

    @JsonProperty("status")
    private String status;

    @JsonProperty("updated_at")
    private String updatedAt;

    public Optional<Integer> getSequenceNumber() {
        return Optional.ofNullable(sequenceNumber);
    }

    public Optional<Flags> getFlags() {
        return Optional.ofNullable(flags);
    }

    public Optional<Count> getCount() {
        return Optional.ofNullable(count);
    }

    public Optional<String> getOutcomeId() {
        return Optional.ofNullable(outcomeId);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public List<Runner> getRunners() {
        return Optional.ofNullable(runners).orElse(Collections.emptyList());
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<String> getHitType() {
        return Optional.ofNullable(hitType);
    }

    public Optional<String> getInningHalf() {
        return Optional.ofNullable(inningHalf);
    }

    public Optional<Integer> getInning() {
        return Optional.ofNullable(inning);
    }

    public Optional<Hitter> getHitter() {
        return Optional.ofNullable(hitter);
    }

    public Optional<Pitcher> getPitcher() {
        return Optional.ofNullable(pitcher);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getHitLocation() {
        return Optional.ofNullable(hitLocation);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }
}
