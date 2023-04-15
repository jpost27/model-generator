
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

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
    "scoring_play",
    "wall_clock",
    "description",
    "alt_description",
    "scoring_description",
    "fake_punt",
    "fake_field_goal",
    "screen_pass",
    "play_action",
    "run_pass_option",
    "created_at",
    "updated_at",
    "start_situation",
    "end_situation",
    "score",
    "statistics",
    "details",
    "quarter",
    "overtime"
})
@Generated("jsonschema2pojo")
public class ScoringPlay {

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
    @JsonProperty("scoring_play")
    public Boolean scoringPlay;
    @JsonProperty("wall_clock")
    public String wallClock;
    @JsonProperty("description")
    public String description;
    @JsonProperty("alt_description")
    public String altDescription;
    @JsonProperty("scoring_description")
    public String scoringDescription;
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
    public StartSituation__1 startSituation;
    @JsonProperty("end_situation")
    public EndSituation__1 endSituation;
    @JsonProperty("score")
    public Score__1 score;
    @JsonProperty("statistics")
    public List<Statistic__1> statistics = new ArrayList<Statistic__1>();
    @JsonProperty("details")
    public List<Detail__1> details = new ArrayList<Detail__1>();
    @JsonProperty("quarter")
    public Quarter__2 quarter;
    @JsonProperty("overtime")
    public Overtime__2 overtime;

}
