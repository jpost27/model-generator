package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Coordinates {
    @JsonProperty("coord_x")
    private Double coordX;

    @JsonProperty("coord_y")
    private Double coordY;

    @JsonProperty("x")
    private Double x;

    @JsonProperty("y")
    private Double y;
}
