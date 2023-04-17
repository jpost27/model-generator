package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Distance {
    @JsonProperty("min")
    private Double min;

    @JsonProperty("avg")
    private Double avg;

    @JsonProperty("max")
    private Double max;

    @JsonProperty("count")
    private Integer count;
}
