
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "avg_yards",
    "attempts",
    "touchdowns",
    "yards",
    "longest",
    "redzone_attempts",
    "first_downs"
})
@Generated("jsonschema2pojo")
public class Totals__15 {

    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("redzone_attempts")
    public Integer redzoneAttempts;
    @JsonProperty("first_downs")
    public Integer firstDowns;

}
