
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

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
    "sr_id",
    "attempts",
    "yards",
    "avg_yards",
    "blocked",
    "longest",
    "touchbacks",
    "inside_20",
    "avg_net_yards",
    "return_yards",
    "net_yards",
    "hang_time",
    "avg_hang_time"
})
@Generated("jsonschema2pojo")
public class Player__2 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
    @JsonProperty("sr_id")
    public String srId;
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
    @JsonProperty("avg_net_yards")
    public Double avgNetYards;
    @JsonProperty("return_yards")
    public Integer returnYards;
    @JsonProperty("net_yards")
    public Integer netYards;
    @JsonProperty("hang_time")
    public Double hangTime;
    @JsonProperty("avg_hang_time")
    public Double avgHangTime;

}
