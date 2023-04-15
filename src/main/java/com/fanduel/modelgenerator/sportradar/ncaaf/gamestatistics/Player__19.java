
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
    "endzone",
    "inside_20",
    "return_yards",
    "touchbacks",
    "yards",
    "number",
    "total_endzone"
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
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("total_endzone")
    public Integer totalEndzone;

}
