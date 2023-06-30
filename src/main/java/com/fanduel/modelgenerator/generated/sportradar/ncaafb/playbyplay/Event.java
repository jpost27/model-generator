package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playbyplay;

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
public class Event {
    @JsonProperty("fake_punt")
    private Boolean fakePunt;

    @JsonProperty("screen_pass")
    private Boolean screenPass;

    @JsonProperty("description")
    private String description;

    @JsonProperty("type")
    private String type;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("score")
    private Score score;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("details")
    private List<Detail> details;

    @JsonProperty("id")
    private String id;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("run_pass_option")
    private Boolean runPassOption;

    @JsonProperty("scoring_description")
    private String scoringDescription;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("scoring_play")
    private Boolean scoringPlay;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sequence")
    private Double sequence;

    @JsonProperty("fake_field_goal")
    private Boolean fakeFieldGoal;

    @JsonProperty("play_action")
    private Boolean playAction;

    @JsonProperty("deleted")
    private Boolean deleted;

    @JsonProperty("play_type")
    private String playType;

    @JsonProperty("alt_description")
    private String altDescription;

    @JsonProperty("start_situation")
    private StartSituation startSituation;

    @JsonProperty("end_situation")
    private EndSituation endSituation;

    @JsonProperty("statistics")
    private List<Statistic> statistics;

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

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<Score> getScore() {
        return Optional.ofNullable(score);
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

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
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

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<Boolean> getScoringPlay() {
        return Optional.ofNullable(scoringPlay);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<Double> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Boolean> getFakeFieldGoal() {
        return Optional.ofNullable(fakeFieldGoal);
    }

    public Optional<Boolean> getPlayAction() {
        return Optional.ofNullable(playAction);
    }

    public Optional<Boolean> getDeleted() {
        return Optional.ofNullable(deleted);
    }

    public Optional<String> getPlayType() {
        return Optional.ofNullable(playType);
    }

    public Optional<String> getAltDescription() {
        return Optional.ofNullable(altDescription);
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
}
