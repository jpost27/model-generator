package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Weather {
    @JsonProperty("current_conditions")
    private CurrentConditions currentConditions;

    @JsonProperty("forecast")
    private Forecast forecast;

    public Optional<CurrentConditions> getCurrentConditions() {
        return Optional.ofNullable(currentConditions);
    }

    public Optional<Forecast> getForecast() {
        return Optional.ofNullable(forecast);
    }
}
