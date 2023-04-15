
package com.fanduel.modelgenerator.sportradar.nba.leaguehierarchy;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "red",
    "green",
    "blue"
})
@Generated("jsonschema2pojo")
public class RgbColor {

    @JsonProperty("red")
    public Integer red;
    @JsonProperty("green")
    public Integer green;
    @JsonProperty("blue")
    public Integer blue;

}
