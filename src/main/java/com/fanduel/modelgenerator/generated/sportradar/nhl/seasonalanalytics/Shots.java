package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Shots {
    @JsonProperty("tip_shot_goals")
    private Double tipShotGoals;

    @JsonProperty("backhand_shot_shots")
    private Double backhandShotShots;

    @JsonProperty("wrap_around_shot_shots")
    private Double wrapAroundShotShots;

    @JsonProperty("wrist_shot_shots")
    private Double wristShotShots;

    @JsonProperty("tip_shot_shots")
    private Double tipShotShots;

    @JsonProperty("backhand_shot_goals")
    private Double backhandShotGoals;

    @JsonProperty("wrist_shot_goals")
    private Double wristShotGoals;

    @JsonProperty("snap_shot_shots")
    private Double snapShotShots;

    @JsonProperty("snap_shot_goals")
    private Double snapShotGoals;

    @JsonProperty("wrap_around_shot_goals")
    private Double wrapAroundShotGoals;

    @JsonProperty("slap_shot_goals")
    private Double slapShotGoals;

    @JsonProperty("slap_shot_shots")
    private Double slapShotShots;
}
