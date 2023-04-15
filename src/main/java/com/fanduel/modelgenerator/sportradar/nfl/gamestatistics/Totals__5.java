
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "completions",
    "cmp_pct",
    "interceptions",
    "sack_yards",
    "rating",
    "touchdowns",
    "avg_yards",
    "sacks",
    "longest",
    "longest_touchdown",
    "air_yards",
    "redzone_attempts",
    "net_yards",
    "yards",
    "first_downs",
    "throw_aways",
    "poor_throws",
    "defended_passes",
    "dropped_passes",
    "spikes",
    "blitzes",
    "hurries",
    "knockdowns",
    "pocket_time",
    "avg_pocket_time",
    "batted_passes",
    "on_target_throws"
})
@Generated("jsonschema2pojo")
public class Totals__5 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("completions")
    public Integer completions;
    @JsonProperty("cmp_pct")
    public Double cmpPct;
    @JsonProperty("interceptions")
    public Integer interceptions;
    @JsonProperty("sack_yards")
    public Integer sackYards;
    @JsonProperty("rating")
    public Double rating;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("sacks")
    public Integer sacks;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("air_yards")
    public Integer airYards;
    @JsonProperty("redzone_attempts")
    public Integer redzoneAttempts;
    @JsonProperty("net_yards")
    public Integer netYards;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("first_downs")
    public Integer firstDowns;
    @JsonProperty("throw_aways")
    public Integer throwAways;
    @JsonProperty("poor_throws")
    public Integer poorThrows;
    @JsonProperty("defended_passes")
    public Integer defendedPasses;
    @JsonProperty("dropped_passes")
    public Integer droppedPasses;
    @JsonProperty("spikes")
    public Integer spikes;
    @JsonProperty("blitzes")
    public Integer blitzes;
    @JsonProperty("hurries")
    public Integer hurries;
    @JsonProperty("knockdowns")
    public Integer knockdowns;
    @JsonProperty("pocket_time")
    public Double pocketTime;
    @JsonProperty("avg_pocket_time")
    public Double avgPocketTime;
    @JsonProperty("batted_passes")
    public Integer battedPasses;
    @JsonProperty("on_target_throws")
    public Integer onTargetThrows;

}
