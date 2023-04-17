package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
