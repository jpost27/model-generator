package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Weather {
    @JsonProperty("current_conditions")
    private CurrentConditions currentConditions;

    @JsonProperty("forecast")
    private Forecast forecast;
}
