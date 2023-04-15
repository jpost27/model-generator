
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coord_x",
    "coord_y",
    "action_area"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("coord_x")
    public Integer coordX;
    @JsonProperty("coord_y")
    public Integer coordY;
    @JsonProperty("action_area")
    public String actionArea;

}
