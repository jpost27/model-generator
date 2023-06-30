package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklydepthcharts;

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
public class Offense {
    @JsonProperty("position")
    private Position position;

    public Optional<Position> getPosition() {
        return Optional.ofNullable(position);
    }
}
