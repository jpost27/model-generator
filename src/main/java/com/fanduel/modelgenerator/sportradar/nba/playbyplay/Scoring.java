
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "times_tied",
    "lead_changes",
    "home",
    "away"
})
@Generated("jsonschema2pojo")
public class Scoring {

    @JsonProperty("times_tied")
    public Integer timesTied;
    @JsonProperty("lead_changes")
    public Integer leadChanges;
    @JsonProperty("home")
    public Home__1 home;
    @JsonProperty("away")
    public Away__1 away;

}
