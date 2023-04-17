package com.fanduel.modelgenerator.generated.sportradar.nba.rankings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class RankingsResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("conferences")
    private List<Conference> conferences;
}
