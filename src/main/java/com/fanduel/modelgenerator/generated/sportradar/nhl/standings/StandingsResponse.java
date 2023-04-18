package com.fanduel.modelgenerator.generated.sportradar.nhl.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class StandingsResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("conferences")
    private List<Conference> conferences;
}
