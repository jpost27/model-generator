package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("weather")
    private Weather weather;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Weather> getWeather() {
        return Optional.ofNullable(weather);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
