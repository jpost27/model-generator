
package com.fanduel.modelgenerator.sportradar.nba.standings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "conference",
    "division"
})
@Generated("jsonschema2pojo")
public class GamesBehind {

    @JsonProperty("league")
    public Double league;
    @JsonProperty("conference")
    public Double conference;
    @JsonProperty("division")
    public Double division;

}
