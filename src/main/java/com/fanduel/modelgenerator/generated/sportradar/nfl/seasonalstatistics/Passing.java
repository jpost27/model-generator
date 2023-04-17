package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Passing {
    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("hurries")
    private Integer hurries;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("defended_passes")
    private Integer defendedPasses;

    @JsonProperty("dropped_passes")
    private Integer droppedPasses;

    @JsonProperty("pocket_time")
    private Double pocketTime;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("rating")
    private Double rating;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("air_yards")
    private Integer airYards;

    @JsonProperty("cmp_pct")
    private Double cmpPct;

    @JsonProperty("int_touchdowns")
    private Integer intTouchdowns;

    @JsonProperty("redzone_attempts")
    private Integer redzoneAttempts;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("sack_yards")
    private Integer sackYards;

    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("on_target_throws")
    private Integer onTargetThrows;

    @JsonProperty("completions")
    private Integer completions;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("avg_pocket_time")
    private Double avgPocketTime;

    @JsonProperty("knockdowns")
    private Integer knockdowns;

    @JsonProperty("interceptions")
    private Integer interceptions;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("gross_yards")
    private Integer grossYards;

    @JsonProperty("poor_throws")
    private Integer poorThrows;

    @JsonProperty("batted_passes")
    private Integer battedPasses;

    @JsonProperty("throw_aways")
    private Integer throwAways;

    @JsonProperty("spikes")
    private Integer spikes;

    @JsonProperty("sacks")
    private Integer sacks;

    @JsonProperty("blitzes")
    private Integer blitzes;
}
