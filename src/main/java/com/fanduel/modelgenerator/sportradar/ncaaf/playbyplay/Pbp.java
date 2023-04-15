
package com.fanduel.modelgenerator.sportradar.ncaaf.playbyplay;

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
    "created_at",
    "updated_at",
    "events",
    "clock",
    "event_type",
    "description",
    "alt_description",
    "wall_clock",
    "inside_20",
    "scoring_drive",
    "team"
})
@Generated("jsonschema2pojo")
public class Pbp {

    @JsonProperty("type")
    public String type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Double sequence;
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
    @JsonProperty("alt_description")
    public String altDescription;
    @JsonProperty("wall_clock")
    public String wallClock;
    @JsonProperty("inside_20")
    public Boolean inside20;
    @JsonProperty("scoring_drive")
    public Boolean scoringDrive;
    @JsonProperty("team")
    public Team__2 team;

}
