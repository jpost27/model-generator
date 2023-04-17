package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Location {
    @JsonProperty("coord_x")
    private Integer coordX;

    @JsonProperty("coord_y")
    private Integer coordY;

    @JsonProperty("action_area")
    private String actionArea;
}
