package com.fanduel.modelgenerator.generated.sportradar.nba.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class RgbColor {
    @JsonProperty("red")
    private Integer red;

    @JsonProperty("green")
    private Integer green;

    @JsonProperty("blue")
    private Integer blue;
}
