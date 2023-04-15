
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pass_attempts",
    "pass_successes",
    "rush_attempts",
    "rush_successes",
    "defense_attempts",
    "defense_successes"
})
@Generated("jsonschema2pojo")
public class Totals__29 {

    @JsonProperty("pass_attempts")
    public Integer passAttempts;
    @JsonProperty("pass_successes")
    public Integer passSuccesses;
    @JsonProperty("rush_attempts")
    public Integer rushAttempts;
    @JsonProperty("rush_successes")
    public Integer rushSuccesses;
    @JsonProperty("defense_attempts")
    public Integer defenseAttempts;
    @JsonProperty("defense_successes")
    public Integer defenseSuccesses;

}
