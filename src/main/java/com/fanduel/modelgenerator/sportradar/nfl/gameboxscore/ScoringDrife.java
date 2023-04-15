
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "sequence",
    "start_reason",
    "end_reason",
    "play_count",
    "duration",
    "first_downs",
    "gain",
    "penalty_yards",
    "inside_20",
    "scoring_drive",
    "quarter",
    "team",
    "plays"
})
@Generated("jsonschema2pojo")
public class ScoringDrife {

    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("start_reason")
    public String startReason;
    @JsonProperty("end_reason")
    public String endReason;
    @JsonProperty("play_count")
    public Integer playCount;
    @JsonProperty("duration")
    public String duration;
    @JsonProperty("first_downs")
    public Integer firstDowns;
    @JsonProperty("gain")
    public Integer gain;
    @JsonProperty("penalty_yards")
    public Integer penaltyYards;
    @JsonProperty("inside_20")
    public Boolean inside20;
    @JsonProperty("scoring_drive")
    public Boolean scoringDrive;
    @JsonProperty("quarter")
    public Quarter quarter;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("plays")
    public List<Play> plays = new ArrayList<Play>();

}
