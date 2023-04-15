
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
    "endzone",
    "inside_20",
    "return_yards",
    "touchbacks",
    "yards",
    "out_of_bounds",
    "number",
    "total_endzone",
    "onside_attempts",
    "onside_successes",
    "squib_kicks"
})
@Generated("jsonschema2pojo")
public class Player__6 {

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
    @JsonProperty("endzone")
    public Integer endzone;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("return_yards")
    public Integer returnYards;
    @JsonProperty("touchbacks")
    public Integer touchbacks;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("out_of_bounds")
    public Integer outOfBounds;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("total_endzone")
    public Integer totalEndzone;
    @JsonProperty("onside_attempts")
    public Integer onsideAttempts;
    @JsonProperty("onside_successes")
    public Integer onsideSuccesses;
    @JsonProperty("squib_kicks")
    public Integer squibKicks;

}
