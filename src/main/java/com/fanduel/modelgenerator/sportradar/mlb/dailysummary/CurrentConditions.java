
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temp_f",
    "condition",
    "humidity",
    "dew_point_f",
    "cloud_cover",
    "obs_time",
    "wind"
})
@Generated("jsonschema2pojo")
public class CurrentConditions {

    @JsonProperty("temp_f")
    public Integer tempF;
    @JsonProperty("condition")
    public String condition;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("dew_point_f")
    public Integer dewPointF;
    @JsonProperty("cloud_cover")
    public Integer cloudCover;
    @JsonProperty("obs_time")
    public String obsTime;
    @JsonProperty("wind")
    public Wind__1 wind;

}
