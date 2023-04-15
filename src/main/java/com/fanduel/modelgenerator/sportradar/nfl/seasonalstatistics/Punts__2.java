
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "yards",
    "avg_yards",
    "blocked",
    "longest",
    "touchbacks",
    "inside_20",
    "net_yards",
    "return_yards",
    "avg_net_yards",
    "hang_time",
    "avg_hang_time"
})
@Generated("jsonschema2pojo")
public class Punts__2 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("touchbacks")
    public Integer touchbacks;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("net_yards")
    public Integer netYards;
    @JsonProperty("return_yards")
    public Integer returnYards;
    @JsonProperty("avg_net_yards")
    public Double avgNetYards;
    @JsonProperty("hang_time")
    public Double hangTime;
    @JsonProperty("avg_hang_time")
    public Double avgHangTime;

}
