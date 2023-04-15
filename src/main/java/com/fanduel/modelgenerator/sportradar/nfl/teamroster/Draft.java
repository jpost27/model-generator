
package com.fanduel.modelgenerator.sportradar.nfl.teamroster;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "year",
    "round",
    "number",
    "team"
})
@Generated("jsonschema2pojo")
public class Draft {

    @JsonProperty("year")
    public Integer year;
    @JsonProperty("round")
    public Integer round;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("team")
    public Team team;

}
