
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "avg_yards",
    "attempts",
    "touchdowns",
    "tlost",
    "tlost_yards",
    "yards",
    "longest",
    "longest_touchdown",
    "redzone_attempts"
})
@Generated("jsonschema2pojo")
public class Rushing {

    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("tlost")
    public Integer tlost;
    @JsonProperty("tlost_yards")
    public Integer tlostYards;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("redzone_attempts")
    public Integer redzoneAttempts;

}
