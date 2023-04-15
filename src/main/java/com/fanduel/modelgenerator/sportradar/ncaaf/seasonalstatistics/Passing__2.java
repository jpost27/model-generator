
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "completions",
    "cmp_pct",
    "yards",
    "avg_yards",
    "sacks",
    "sack_yards",
    "touchdowns",
    "longest",
    "interceptions",
    "rating",
    "longest_touchdown",
    "air_yards",
    "redzone_attempts",
    "gross_yards",
    "first_downs"
})
@Generated("jsonschema2pojo")
public class Passing__2 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("completions")
    public Integer completions;
    @JsonProperty("cmp_pct")
    public Double cmpPct;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("sacks")
    public Integer sacks;
    @JsonProperty("sack_yards")
    public Integer sackYards;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("interceptions")
    public Integer interceptions;
    @JsonProperty("rating")
    public Double rating;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("air_yards")
    public Integer airYards;
    @JsonProperty("redzone_attempts")
    public Integer redzoneAttempts;
    @JsonProperty("gross_yards")
    public Integer grossYards;
    @JsonProperty("first_downs")
    public Integer firstDowns;

}
