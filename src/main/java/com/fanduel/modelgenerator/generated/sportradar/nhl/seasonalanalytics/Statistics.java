package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistics {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;
}
