
package com.fanduel.modelgenerator.sportradar.mlb.dailyboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "forecast",
    "current_conditions"
})
@Generated("jsonschema2pojo")
public class Weather {

    @JsonProperty("forecast")
    public Forecast forecast;
    @JsonProperty("current_conditions")
    public CurrentConditions currentConditions;

}
