
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "direction"
})
@Generated("jsonschema2pojo")
public class Wind {

    @JsonProperty("speed")
    public Integer speed;
    @JsonProperty("direction")
    public String direction;

}
