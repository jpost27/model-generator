
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "avg_yards",
    "yards",
    "longest",
    "touchdowns",
    "longest_touchdown",
    "faircatches",
    "returns"
})
@Generated("jsonschema2pojo")
public class KickReturns {

    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("longest_touchdown")
    public Integer longestTouchdown;
    @JsonProperty("faircatches")
    public Integer faircatches;
    @JsonProperty("returns")
    public Integer returns;

}
