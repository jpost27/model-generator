
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "returns",
    "yards",
    "avg_yards",
    "touchdowns",
    "longest",
    "faircatches",
    "longest_touchdown"
})
@Generated("jsonschema2pojo")
public class PuntReturns__2 {

    @JsonProperty("returns")
    public Integer returns;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("faircatches")
    public Integer faircatches;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;

}
