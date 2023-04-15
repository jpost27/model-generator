
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "trajectory",
    "hardness",
    "coordinates"
})
@Generated("jsonschema2pojo")
public class MlbHitData {

    @JsonProperty("trajectory")
    public String trajectory;
    @JsonProperty("hardness")
    public String hardness;
    @JsonProperty("coordinates")
    public Coordinates__1 coordinates;

}
