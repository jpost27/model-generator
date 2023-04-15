
package com.fanduel.modelgenerator.sportradar.nba.freeagents;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "free_agents"
})
@Generated("jsonschema2pojo")
public class FreeAgentsResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("free_agents")
    public List<FreeAgent> freeAgents = new ArrayList<FreeAgent>();

}
