
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
    "first_downs",
    "penalties",
    "yards"
})
@Generated("jsonschema2pojo")
public class Player__16 {

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
    @JsonProperty("first_downs")
    public Integer firstDowns;
    @JsonProperty("penalties")
    public Integer penalties;
    @JsonProperty("yards")
    public Integer yards;

}
