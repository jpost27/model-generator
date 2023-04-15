
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coord_x",
    "coord_y"
})
@Generated("jsonschema2pojo")
public class Coordinates__1 {

    @JsonProperty("coord_x")
    public Double coordX;
    @JsonProperty("coord_y")
    public Double coordY;

}
