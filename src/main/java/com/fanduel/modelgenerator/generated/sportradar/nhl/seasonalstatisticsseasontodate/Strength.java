package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalstatisticsseasontodate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Strength {
    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("type")
    private String type;

    @JsonProperty("opportunities")
    private Integer opportunities;

    @JsonProperty("goals")
    private Integer goals;
}
