package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersgoaltending;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Average {
    @JsonProperty("goals_against")
    private Double goalsAgainst;

    @JsonProperty("shots_against")
    private Double shotsAgainst;
}
