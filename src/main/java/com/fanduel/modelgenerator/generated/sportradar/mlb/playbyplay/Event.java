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
public class Event {
    @JsonProperty("sequence_number")
    private Integer sequenceNumber;

    @JsonProperty("flags")
    private Flags flags;

    @JsonProperty("count")
    private Count count;

    @JsonProperty("official")
    private Boolean official;

    @JsonProperty("lineup")
    private Lineup lineup;

    @JsonProperty("outcome_id")
    private String outcomeId;

    @JsonProperty("type")
    private String type;

    @JsonProperty("fielders")
    private List<Fielder> fielders;

    @JsonProperty("runners")
    private List<Runner> runners;

    @JsonProperty("at_bat")
    private AtBat atBat;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("mlb_pitch_data")
    private MlbPitchData mlbPitchData;

    @JsonProperty("hit_type")
    private String hitType;

    @JsonProperty("wall_clock")
    private WallClock wallClock;

    @JsonProperty("hitter")
    private Hitter hitter;

    @JsonProperty("pitcher")
    private Pitcher pitcher;

    @JsonProperty("id")
    private String id;

    @JsonProperty("hit_location")
    private String hitLocation;

    @JsonProperty("mlb_hit_data")
    private MlbHitData mlbHitData;

    @JsonProperty("errors")
    private List<Error> errors;

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

    public Optional<Boolean> getOfficial() {
        return Optional.ofNullable(official);
    }

    public Optional<Lineup> getLineup() {
        return Optional.ofNullable(lineup);
    }

    public Optional<String> getOutcomeId() {
        return Optional.ofNullable(outcomeId);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public List<Fielder> getFielders() {
        return Optional.ofNullable(fielders).orElse(Collections.emptyList());
    }

    public List<Runner> getRunners() {
        return Optional.ofNullable(runners).orElse(Collections.emptyList());
    }

    public Optional<AtBat> getAtBat() {
        return Optional.ofNullable(atBat);
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<MlbPitchData> getMlbPitchData() {
        return Optional.ofNullable(mlbPitchData);
    }

    public Optional<String> getHitType() {
        return Optional.ofNullable(hitType);
    }

    public Optional<WallClock> getWallClock() {
        return Optional.ofNullable(wallClock);
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

    public Optional<MlbHitData> getMlbHitData() {
        return Optional.ofNullable(mlbHitData);
    }

    public List<Error> getErrors() {
        return Optional.ofNullable(errors).orElse(Collections.emptyList());
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }
}
