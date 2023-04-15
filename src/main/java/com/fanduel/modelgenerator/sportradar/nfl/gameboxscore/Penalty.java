
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "result",
    "yards",
    "team"
})
@Generated("jsonschema2pojo")
public class Penalty {

    @JsonProperty("description")
    public String description;
    @JsonProperty("result")
    public String result;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("team")
    public Team__2 team;

}
