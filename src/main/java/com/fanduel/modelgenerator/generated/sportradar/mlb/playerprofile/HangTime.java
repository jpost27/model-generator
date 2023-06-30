package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class HangTime {
    @JsonProperty("min")
    private Double min;

    @JsonProperty("avg")
    private Double avg;

    @JsonProperty("max")
    private Double max;

    @JsonProperty("count")
    private Integer count;

    public Optional<Double> getMin() {
        return Optional.ofNullable(min);
    }

    public Optional<Double> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<Double> getMax() {
        return Optional.ofNullable(max);
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(count);
    }
}
