
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
    "attempts",
    "yards",
    "avg_yards",
    "blocked",
    "longest",
    "touchbacks",
    "inside_20",
    "avg_net_yards",
    "return_yards",
    "net_yards"
})
@Generated("jsonschema2pojo")
public class Player__15 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("jersey")
    public String jersey;
    @JsonProperty("position")
    public String position;
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

}
