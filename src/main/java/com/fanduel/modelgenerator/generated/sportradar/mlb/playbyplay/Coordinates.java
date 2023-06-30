package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Coordinates {
    @JsonProperty("coord_x")
    private Double coordX;

    @JsonProperty("coord_y")
    private Double coordY;

    @JsonProperty("x")
    private Double x;

    @JsonProperty("y")
    private Double y;

    public Optional<Double> getCoordX() {
        return Optional.ofNullable(coordX);
    }

    public Optional<Double> getCoordY() {
        return Optional.ofNullable(coordY);
    }

    public Optional<Double> getX() {
        return Optional.ofNullable(x);
    }

    public Optional<Double> getY() {
        return Optional.ofNullable(y);
    }
}
