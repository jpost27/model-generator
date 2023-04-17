package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GamesBehind {
    @JsonProperty("division")
    private Double division;

    @JsonProperty("conference")
    private Double conference;

    @JsonProperty("league")
    private Double league;
}
