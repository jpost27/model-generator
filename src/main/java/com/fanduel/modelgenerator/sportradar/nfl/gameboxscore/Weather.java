
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "condition",
    "humidity",
    "temp",
    "wind"
})
@Generated("jsonschema2pojo")
public class Weather {

    @JsonProperty("condition")
    public String condition;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("temp")
    public Integer temp;
    @JsonProperty("wind")
    public Wind wind;

}
