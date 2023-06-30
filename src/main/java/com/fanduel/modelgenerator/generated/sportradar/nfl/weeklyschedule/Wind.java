package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyschedule;

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
    @JsonProperty("speed")
    private Integer speed;

    @JsonProperty("direction")
    private String direction;

    public Optional<Integer> getSpeed() {
        return Optional.ofNullable(speed);
    }

    public Optional<String> getDirection() {
        return Optional.ofNullable(direction);
    }
}
