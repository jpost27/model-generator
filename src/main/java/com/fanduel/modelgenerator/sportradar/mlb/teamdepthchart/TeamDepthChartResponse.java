
package com.fanduel.modelgenerator.sportradar.mlb.teamdepthchart;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team",
    "_comment"
})
@Generated("jsonschema2pojo")
public class TeamDepthChartResponse {

    @JsonProperty("team")
    public Team team;
    @JsonProperty("_comment")
    public String comment;

}
