package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
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

    public Optional<Boolean> getFakePunt() {
        return Optional.ofNullable(fakePunt);
    }

    public Optional<Boolean> getScreenPass() {
        return Optional.ofNullable(screenPass);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<Integer> getRunningLane() {
        return Optional.ofNullable(runningLane);
    }

    public Optional<String> getHuddle() {
        return Optional.ofNullable(huddle);
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<Score> getScore() {
        return Optional.ofNullable(score);
    }

    public Optional<Integer> getMenInBox() {
        return Optional.ofNullable(menInBox);
    }

    public Optional<String> getWallClock() {
        return Optional.ofNullable(wallClock);
    }

    public List<Detail> getDetails() {
        return Optional.ofNullable(details).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPassRoute() {
        return Optional.ofNullable(passRoute);
    }

    public Optional<String> getPlayDirection() {
        return Optional.ofNullable(playDirection);
    }

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }

    public Optional<Integer> getPlayersRushed() {
        return Optional.ofNullable(playersRushed);
    }

    public Optional<Boolean> getRunPassOption() {
        return Optional.ofNullable(runPassOption);
    }

    public Optional<String> getScoringDescription() {
        return Optional.ofNullable(scoringDescription);
    }

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public Optional<String> getHashMark() {
        return Optional.ofNullable(hashMark);
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<Boolean> getScoringPlay() {
        return Optional.ofNullable(scoringPlay);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getPocketLocation() {
        return Optional.ofNullable(pocketLocation);
    }

    public Optional<Boolean> getGoaltogo() {
        return Optional.ofNullable(goaltogo);
    }

    public Optional<Integer> getLeftTightends() {
        return Optional.ofNullable(leftTightends);
    }

    public Optional<Double> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Boolean> getFakeFieldGoal() {
        return Optional.ofNullable(fakeFieldGoal);
    }

    public Optional<Boolean> getBlitz() {
        return Optional.ofNullable(blitz);
    }

    public Optional<String> getQbAtSnap() {
        return Optional.ofNullable(qbAtSnap);
    }

    public Optional<Boolean> getPlayAction() {
        return Optional.ofNullable(playAction);
    }

    public Optional<String> getPlayType() {
        return Optional.ofNullable(playType);
    }

    public Optional<Integer> getRightTightends() {
        return Optional.ofNullable(rightTightends);
    }

    public Optional<StartSituation> getStartSituation() {
        return Optional.ofNullable(startSituation);
    }

    public Optional<EndSituation> getEndSituation() {
        return Optional.ofNullable(endSituation);
    }

    public List<Statistic> getStatistics() {
        return Optional.ofNullable(statistics).orElse(Collections.emptyList());
    }

    public Optional<Quarter> getQuarter() {
        return Optional.ofNullable(quarter);
    }
}
