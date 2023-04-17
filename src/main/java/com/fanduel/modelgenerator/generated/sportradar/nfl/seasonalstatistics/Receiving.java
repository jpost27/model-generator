package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Receiving {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("dropped_passes")
    private Integer droppedPasses;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("yards_after_contact")
    private Integer yardsAfterContact;

    @JsonProperty("broken_tackles")
    private Integer brokenTackles;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("targets")
    private Integer targets;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("redzone_targets")
    private Integer redzoneTargets;

    @JsonProperty("air_yards")
    private Integer airYards;

    @JsonProperty("receptions")
    private Integer receptions;

    @JsonProperty("catchable_passes")
    private Integer catchablePasses;

    @JsonProperty("yards_after_catch")
    private Integer yardsAfterCatch;
}
