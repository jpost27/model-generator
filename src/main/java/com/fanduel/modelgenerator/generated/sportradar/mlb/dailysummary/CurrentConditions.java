package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class CurrentConditions {
    @JsonProperty("temp_f")
    private Integer tempF;

    @JsonProperty("condition")
    private String condition;

    @JsonProperty("dew_point_f")
    private Integer dewPointF;

    @JsonProperty("obs_time")
    private String obsTime;

    @JsonProperty("cloud_cover")
    private Integer cloudCover;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("wind")
    private Wind wind;
}
