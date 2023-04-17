package com.fanduel.modelgenerator.generated.sportradar.nba.freeagents;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class FreeAgentsResponse {
    @JsonProperty("free_agents")
    private List<FreeAgent> freeAgents;

    @JsonProperty("league")
    private League league;
}
