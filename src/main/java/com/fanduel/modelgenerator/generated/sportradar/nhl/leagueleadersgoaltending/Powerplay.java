package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersgoaltending;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Powerplay {
    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;

    @JsonProperty("saves_pct")
    private Double savesPct;
}
