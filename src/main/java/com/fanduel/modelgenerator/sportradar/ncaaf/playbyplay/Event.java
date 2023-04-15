
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
    "clock",
    "home_points",
    "away_points",
    "play_type",
    "wall_clock",
    "description",
    "alt_description",
    "fake_punt",
    "fake_field_goal",
    "screen_pass",
    "play_action",
    "run_pass_option",
    "created_at",
    "updated_at",
    "start_situation",
    "end_situation",
    "statistics",
    "details",
    "deleted",
    "scoring_play",
    "scoring_description",
    "score"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("type")
    public String type;
    @JsonProperty("id")
    public String id;
    @JsonProperty("sequence")
    public Double sequence;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("home_points")
    public Integer homePoints;
    @JsonProperty("away_points")
    public Integer awayPoints;
    @JsonProperty("play_type")
    public String playType;
    @JsonProperty("wall_clock")
    public String wallClock;
    @JsonProperty("description")
    public String description;
    @JsonProperty("alt_description")
    public String altDescription;
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
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("start_situation")
    public StartSituation startSituation;
    @JsonProperty("end_situation")
    public EndSituation endSituation;
    @JsonProperty("statistics")
    public List<Statistic> statistics = new ArrayList<Statistic>();
    @JsonProperty("details")
    public List<Detail> details = new ArrayList<Detail>();
    @JsonProperty("deleted")
    public Boolean deleted;
    @JsonProperty("scoring_play")
    public Boolean scoringPlay;
    @JsonProperty("scoring_description")
    public String scoringDescription;
    @JsonProperty("score")
    public Score score;

}
