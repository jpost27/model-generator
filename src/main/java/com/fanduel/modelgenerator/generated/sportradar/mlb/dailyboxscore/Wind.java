package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

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
public class Wind {
    @JsonProperty("speed_mph")
    private Integer speedMph;

    @JsonProperty("direction")
    private String direction;

    public Optional<Integer> getSpeedMph() {
        return Optional.ofNullable(speedMph);
    }

    public Optional<String> getDirection() {
        return Optional.ofNullable(direction);
    }
}
