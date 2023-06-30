package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class Pbp {
    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("fake_punt")
    private Boolean fakePunt;

    @JsonProperty("screen_pass")
    private Boolean screenPass;

    @JsonProperty("team_sequence")
    private Integer teamSequence;

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

    @JsonProperty("pat_points_attempted")
    private Integer patPointsAttempted;

    @JsonProperty("offensive_team")
    private OffensiveTeam offensiveTeam;

    @JsonProperty("details")
    private List<Detail> details;

    @JsonProperty("id")
    private String id;

    @JsonProperty("defensive_team")
    private DefensiveTeam defensiveTeam;

    @JsonProperty("events")
    private List<Event> events;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("start_clock")
    private String startClock;

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

    @JsonProperty("first_drive_yardline")
    private Integer firstDriveYardline;

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

    @JsonProperty("last_drive_yardline")
    private Integer lastDriveYardline;

    @JsonProperty("fake_field_goal")
    private Boolean fakeFieldGoal;

    @JsonProperty("play_action")
    private Boolean playAction;

    @JsonProperty("scoring_drive")
    private Boolean scoringDrive;

    @JsonProperty("play_type")
    private String playType;

    @JsonProperty("end_clock")
    private String endClock;

    @JsonProperty("start_situation")
    private StartSituation startSituation;

    @JsonProperty("end_situation")
    private EndSituation endSituation;

    @JsonProperty("penalty_yards")
    private Integer penaltyYards;

    @JsonProperty("statistics")
    private List<Statistic> statistics;

    public Optional<Integer> getNetYards() {
        return Optional.ofNullable(netYards);
    }

    public Optional<Boolean> getFakePunt() {
        return Optional.ofNullable(fakePunt);
    }

    public Optional<Boolean> getScreenPass() {
        return Optional.ofNullable(screenPass);
    }

    public Optional<Integer> getTeamSequence() {
        return Optional.ofNullable(teamSequence);
    }

    public Optional<Boolean> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<Integer> getGain() {
        return Optional.ofNullable(gain);
    }

    public Optional<String> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(createdAt);
    }

    public Optional<String> getWallClock() {
        return Optional.ofNullable(wallClock);
    }

    public Optional<Integer> getPatPointsAttempted() {
        return Optional.ofNullable(patPointsAttempted);
    }

    public Optional<OffensiveTeam> getOffensiveTeam() {
        return Optional.ofNullable(offensiveTeam);
    }

    public List<Detail> getDetails() {
        return Optional.ofNullable(details).orElse(Collections.emptyList());
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<DefensiveTeam> getDefensiveTeam() {
        return Optional.ofNullable(defensiveTeam);
    }

    public List<Event> getEvents() {
        return Optional.ofNullable(events).orElse(Collections.emptyList());
    }

    public Optional<String> getUpdatedAt() {
        return Optional.ofNullable(updatedAt);
    }

    public Optional<String> getStartClock() {
        return Optional.ofNullable(startClock);
    }

    public Optional<Boolean> getRunPassOption() {
        return Optional.ofNullable(runPassOption);
    }

    public Optional<String> getEndReason() {
        return Optional.ofNullable(endReason);
    }

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public Optional<Integer> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<Integer> getFirstDriveYardline() {
        return Optional.ofNullable(firstDriveYardline);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<String> getEventType() {
        return Optional.ofNullable(eventType);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<Integer> getPlayCount() {
        return Optional.ofNullable(playCount);
    }

    public Optional<String> getStartReason() {
        return Optional.ofNullable(startReason);
    }

    public Optional<Integer> getLastDriveYardline() {
        return Optional.ofNullable(lastDriveYardline);
    }

    public Optional<Boolean> getFakeFieldGoal() {
        return Optional.ofNullable(fakeFieldGoal);
    }

    public Optional<Boolean> getPlayAction() {
        return Optional.ofNullable(playAction);
    }

    public Optional<Boolean> getScoringDrive() {
        return Optional.ofNullable(scoringDrive);
    }

    public Optional<String> getPlayType() {
        return Optional.ofNullable(playType);
    }

    public Optional<String> getEndClock() {
        return Optional.ofNullable(endClock);
    }

    public Optional<StartSituation> getStartSituation() {
        return Optional.ofNullable(startSituation);
    }

    public Optional<EndSituation> getEndSituation() {
        return Optional.ofNullable(endSituation);
    }

    public Optional<Integer> getPenaltyYards() {
        return Optional.ofNullable(penaltyYards);
    }

    public List<Statistic> getStatistics() {
        return Optional.ofNullable(statistics).orElse(Collections.emptyList());
    }
}
