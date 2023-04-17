package com.fanduel.modelgenerator.generated.sportradar.nfl.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LeagueHierarchyResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("conferences")
    private List<Conference> conferences;
}
