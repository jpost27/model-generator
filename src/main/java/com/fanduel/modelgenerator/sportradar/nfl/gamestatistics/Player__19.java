
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
    "avg_yards",
    "yards",
    "longest",
    "touchdowns",
    "faircatches",
    "number"
})
@Generated("jsonschema2pojo")
public class Player__19 {

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
    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("faircatches")
    public Integer faircatches;
    @JsonProperty("number")
    public Integer number;

}
