package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pbp {
    @JsonProperty("fake_punt")
    private Boolean fakePunt;

    @JsonProperty("screen_pass")
    private Boolean screenPass;

    @JsonProperty("inside_20")
    private Boolean inside20;

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;

    @JsonProperty("gain")
    private Integer gain;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("details")
    private List<Detail> details;

    @JsonProperty("id")
    private String id;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("run_pass_option")
    private Boolean runPassOption;

    @JsonProperty("end_reason")
    private String endReason;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("play_count")
    private Integer playCount;

    @JsonProperty("start_reason")
    private String startReason;

    @JsonProperty("fake_field_goal")
    private Boolean fakeFieldGoal;

    @JsonProperty("play_action")
    private Boolean playAction;

    @JsonProperty("scoring_drive")
    private Boolean scoringDrive;

    @JsonProperty("play_type")
    private String playType;

    @JsonProperty("start_situation")
    private StartSituation startSituation;

    @JsonProperty("end_situation")
    private EndSituation endSituation;

    @JsonProperty("penalty_yards")
    private Integer penaltyYards;

    @JsonProperty("statistics")
    private List<Statistic> statistics;
}
