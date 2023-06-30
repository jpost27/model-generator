package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

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
public class ScoringDrife {
    @JsonProperty("plays")
    private List<Play> plays;

    @JsonProperty("end_reason")
    private String endReason;

    @JsonProperty("inside_20")
    private Boolean inside20;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("gain")
    private Integer gain;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("play_count")
    private Integer playCount;

    @JsonProperty("start_reason")
    private String startReason;

    @JsonProperty("scoring_drive")
    private Boolean scoringDrive;

    @JsonProperty("id")
    private String id;

    @JsonProperty("penalty_yards")
    private Integer penaltyYards;

    @JsonProperty("quarter")
    private Quarter quarter;

    public List<Play> getPlays() {
        return Optional.ofNullable(plays).orElse(Collections.emptyList());
    }

    public Optional<String> getEndReason() {
        return Optional.ofNullable(endReason);
    }

    public Optional<Boolean> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<Integer> getGain() {
        return Optional.ofNullable(gain);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getPlayCount() {
        return Optional.ofNullable(playCount);
    }

    public Optional<String> getStartReason() {
        return Optional.ofNullable(startReason);
    }

    public Optional<Boolean> getScoringDrive() {
        return Optional.ofNullable(scoringDrive);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getPenaltyYards() {
        return Optional.ofNullable(penaltyYards);
    }

    public Optional<Quarter> getQuarter() {
        return Optional.ofNullable(quarter);
    }
}
