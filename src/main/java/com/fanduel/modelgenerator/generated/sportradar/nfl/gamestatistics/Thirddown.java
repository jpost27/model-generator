package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Thirddown {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("successes")
    private Integer successes;

    @JsonProperty("attempts")
    private Integer attempts;
}
