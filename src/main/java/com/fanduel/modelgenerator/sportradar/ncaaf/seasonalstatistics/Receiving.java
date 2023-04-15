
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "targets",
    "receptions",
    "avg_yards",
    "yards",
    "touchdowns",
    "yards_after_catch",
    "longest",
    "longest_touchdown",
    "redzone_targets",
    "air_yards"
})
@Generated("jsonschema2pojo")
public class Receiving {

    @JsonProperty("targets")
    public Integer targets;
    @JsonProperty("receptions")
    public Integer receptions;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("redzone_targets")
    public Integer redzoneTargets;
    @JsonProperty("air_yards")
    public Integer airYards;

}
