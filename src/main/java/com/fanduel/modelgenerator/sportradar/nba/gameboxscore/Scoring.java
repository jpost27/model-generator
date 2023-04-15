
package com.fanduel.modelgenerator.sportradar.nba.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "number",
    "sequence",
    "points"
})
@Generated("jsonschema2pojo")
public class Scoring {

    @JsonProperty("type")
    public String type;
    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("points")
    public Integer points;

}
