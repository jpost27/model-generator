
package com.fanduel.modelgenerator.sportradar.nfl.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
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
    "created_at",
    "updated_at",
    "events",
    "clock",
    "event_type",
    "description",
    "wall_clock",
    "home_points",
    "away_points",
    "play_type",
    "fake_punt",
    "fake_field_goal",
    "screen_pass",
    "play_action",
    "run_pass_option",
    "start_situation",
    "end_situation",
    "statistics",
    "details"
})
@Generated("jsonschema2pojo")
public class Pbp {

    @JsonProperty("type")
    public String type;
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
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("events")
    public List<Event> events = new ArrayList<Event>();
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("event_type")
    public String eventType;
    @JsonProperty("description")
    public String description;
    @JsonProperty("wall_clock")
    public String wallClock;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("play_type")
    public String playType;
    @JsonProperty("fake_punt")
    public Boolean fakePunt;
    @JsonProperty("fake_field_goal")
    public Boolean fakeFieldGoal;
    @JsonProperty("screen_pass")
    public Boolean screenPass;
    @JsonProperty("play_action")
    public Boolean playAction;
    @JsonProperty("run_pass_option")
    public Boolean runPassOption;
    @JsonProperty("start_situation")
    public StartSituation__1 startSituation;
    @JsonProperty("end_situation")
    public EndSituation__1 endSituation;
    @JsonProperty("statistics")
    public List<Statistic__1> statistics = new ArrayList<Statistic__1>();
    @JsonProperty("details")
    public List<Detail__1> details = new ArrayList<Detail__1>();

}
