package com.fanduel.modelgenerator.generated.sportradar.nba.seasonalstatisticsseasontodate;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Opponents {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;
}
