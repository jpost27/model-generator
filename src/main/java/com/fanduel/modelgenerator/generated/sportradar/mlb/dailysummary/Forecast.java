package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Forecast {
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

    public Optional<Integer> getTempF() {
        return Optional.ofNullable(tempF);
    }

    public Optional<String> getCondition() {
        return Optional.ofNullable(condition);
    }

    public Optional<Integer> getDewPointF() {
        return Optional.ofNullable(dewPointF);
    }

    public Optional<String> getObsTime() {
        return Optional.ofNullable(obsTime);
    }

    public Optional<Integer> getCloudCover() {
        return Optional.ofNullable(cloudCover);
    }

    public Optional<Integer> getHumidity() {
        return Optional.ofNullable(humidity);
    }

    public Optional<Wind> getWind() {
        return Optional.ofNullable(wind);
    }
}
