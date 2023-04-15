
package com.fanduel.modelgenerator.sportradar.nba.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "points",
    "own_score",
    "opp_score"
})
@Generated("jsonschema2pojo")
public class MostUnanswered__1 {

    @JsonProperty("points")
    public Integer points;
    @JsonProperty("own_score")
    public Integer ownScore;
    @JsonProperty("opp_score")
    public Integer oppScore;

}
