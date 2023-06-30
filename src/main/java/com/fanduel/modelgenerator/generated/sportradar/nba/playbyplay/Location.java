package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

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
public class Location {
    @JsonProperty("coord_x")
    private Integer coordX;

    @JsonProperty("coord_y")
    private Integer coordY;

    @JsonProperty("action_area")
    private String actionArea;

    public Optional<Integer> getCoordX() {
        return Optional.ofNullable(coordX);
    }

    public Optional<Integer> getCoordY() {
        return Optional.ofNullable(coordY);
    }

    public Optional<String> getActionArea() {
        return Optional.ofNullable(actionArea);
    }
}
