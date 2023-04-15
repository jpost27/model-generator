
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "yards",
    "net_yards",
    "blocked",
    "touchbacks",
    "inside_20",
    "return_yards",
    "avg_net_yards",
    "avg_yards",
    "longest"
})
@Generated("jsonschema2pojo")
public class Totals__2 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("net_yards")
    public Integer netYards;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("touchbacks")
    public Integer touchbacks;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("return_yards")
    public Integer returnYards;
    @JsonProperty("avg_net_yards")
    public Double avgNetYards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("longest")
    public Integer longest;

}
