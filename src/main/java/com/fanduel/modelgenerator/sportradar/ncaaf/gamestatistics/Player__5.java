
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "jersey",
    "position",
    "first_downs",
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
    "redzone_attempts"
})
@Generated("jsonschema2pojo")
public class Player__5 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("first_downs")
    public Integer firstDowns;
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

}
