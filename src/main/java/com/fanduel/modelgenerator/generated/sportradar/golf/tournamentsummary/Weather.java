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
public class Weather {
    @JsonProperty("temp")
    private Integer temp;

    @JsonProperty("condition")
    private String condition;

    @JsonProperty("wind")
    private Wind wind;

    public Optional<Integer> getTemp() {
        return Optional.ofNullable(temp);
    }

    public Optional<String> getCondition() {
        return Optional.ofNullable(condition);
    }

    public Optional<Wind> getWind() {
        return Optional.ofNullable(wind);
    }
}
