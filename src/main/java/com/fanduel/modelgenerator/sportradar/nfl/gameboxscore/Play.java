
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

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
    "fake_punt",
    "fake_field_goal",
    "screen_pass",
    "hash_mark",
    "play_action",
    "run_pass_option",
    "created_at",
    "updated_at",
    "start_situation",
    "end_situation",
    "statistics",
    "details",
    "quarter",
    "players_rushed",
    "men_in_box",
    "blitz",
    "play_direction",
    "left_tightends",
    "right_tightends",
    "pocket_location",
    "qb_at_snap",
    "huddle",
    "pass_route",
    "running_lane",
    "goaltogo",
    "scoring_play",
    "scoring_description",
    "score"
})
@Generated("jsonschema2pojo")
public class Play {

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
    @JsonProperty("fake_punt")
    public Boolean fakePunt;
    @JsonProperty("fake_field_goal")
    public Boolean fakeFieldGoal;
    @JsonProperty("screen_pass")
    public Boolean screenPass;
    @JsonProperty("hash_mark")
    public String hashMark;
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
    @JsonProperty("quarter")
    public Quarter__1 quarter;
    @JsonProperty("players_rushed")
    public Integer playersRushed;
    @JsonProperty("men_in_box")
    public Integer menInBox;
    @JsonProperty("blitz")
    public Boolean blitz;
    @JsonProperty("play_direction")
    public String playDirection;
    @JsonProperty("left_tightends")
    public Integer leftTightends;
    @JsonProperty("right_tightends")
    public Integer rightTightends;
    @JsonProperty("pocket_location")
    public String pocketLocation;
    @JsonProperty("qb_at_snap")
    public String qbAtSnap;
    @JsonProperty("huddle")
    public String huddle;
    @JsonProperty("pass_route")
    public String passRoute;
    @JsonProperty("running_lane")
    public Integer runningLane;
    @JsonProperty("goaltogo")
    public Boolean goaltogo;
    @JsonProperty("scoring_play")
    public Boolean scoringPlay;
    @JsonProperty("scoring_description")
    public String scoringDescription;
    @JsonProperty("score")
    public Score score;

}
