package com.fanduel.modelgenerator.generated.sportradar.nba.injuries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class InjuriesResponse {
    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("league")
    private League league;
}
