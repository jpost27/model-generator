package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonschedule;

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
public class Weather {
    @JsonProperty("condition")
    private String condition;

    @JsonProperty("temp")
    private Integer temp;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("wind")
    private Wind wind;

    public Optional<String> getCondition() {
        return Optional.ofNullable(condition);
    }

    public Optional<Integer> getTemp() {
        return Optional.ofNullable(temp);
    }

    public Optional<Integer> getHumidity() {
        return Optional.ofNullable(humidity);
    }

    public Optional<Wind> getWind() {
        return Optional.ofNullable(wind);
    }
}
