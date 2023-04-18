package com.fanduel.modelgenerator.generated.sportradar.nhl.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LeagueHierarchyResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("conferences")
    private List<Conference> conferences;
}
