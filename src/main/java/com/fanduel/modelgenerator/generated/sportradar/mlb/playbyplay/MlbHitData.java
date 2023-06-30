package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class MlbHitData {
    @JsonProperty("hardness")
    private String hardness;

    @JsonProperty("coordinates")
    private Coordinates coordinates;

    @JsonProperty("trajectory")
    private String trajectory;

    public Optional<String> getHardness() {
        return Optional.ofNullable(hardness);
    }

    public Optional<Coordinates> getCoordinates() {
        return Optional.ofNullable(coordinates);
    }

    public Optional<String> getTrajectory() {
        return Optional.ofNullable(trajectory);
    }
}
