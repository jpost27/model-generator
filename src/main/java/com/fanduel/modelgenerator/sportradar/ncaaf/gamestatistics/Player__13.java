
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
    "avg_yards",
    "attempts",
    "touchdowns",
    "yards",
    "longest",
    "redzone_attempts",
    "tlost",
    "tlost_yards"
})
@Generated("jsonschema2pojo")
public class Player__13 {

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
    @JsonProperty("tlost")
    public Integer tlost;
    @JsonProperty("tlost_yards")
    public Integer tlostYards;

}
