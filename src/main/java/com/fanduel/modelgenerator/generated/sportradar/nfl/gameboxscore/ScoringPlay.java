package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ScoringPlay {
    @JsonProperty("fake_punt")
    private Boolean fakePunt;

    @JsonProperty("screen_pass")
    private Boolean screenPass;

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;

    @JsonProperty("running_lane")
    private Integer runningLane;

    @JsonProperty("huddle")
    private String huddle;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("score")
    private Score score;

    @JsonProperty("men_in_box")
    private Integer menInBox;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("details")
    private List<Detail> details;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pass_route")
    private String passRoute;

    @JsonProperty("play_direction")
    private String playDirection;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("players_rushed")
    private Integer playersRushed;

    @JsonProperty("run_pass_option")
    private Boolean runPassOption;

    @JsonProperty("scoring_description")
    private String scoringDescription;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("hash_mark")
    private String hashMark;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("scoring_play")
    private Boolean scoringPlay;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("pocket_location")
    private String pocketLocation;

    @JsonProperty("goaltogo")
    private Boolean goaltogo;

    @JsonProperty("left_tightends")
    private Integer leftTightends;

    @JsonProperty("sequence")
    private Double sequence;

    @JsonProperty("fake_field_goal")
    private Boolean fakeFieldGoal;

    @JsonProperty("blitz")
    private Boolean blitz;

    @JsonProperty("qb_at_snap")
    private String qbAtSnap;

    @JsonProperty("play_action")
    private Boolean playAction;

    @JsonProperty("play_type")
    private String playType;

    @JsonProperty("right_tightends")
    private Integer rightTightends;

    @JsonProperty("start_situation")
    private StartSituation startSituation;

    @JsonProperty("end_situation")
    private EndSituation endSituation;

    @JsonProperty("statistics")
    private List<Statistic> statistics;

    @JsonProperty("quarter")
    private Quarter quarter;
}
