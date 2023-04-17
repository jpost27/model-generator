package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Swings {
    @JsonProperty("swing_rate")
    private Double swingRate;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("whiff_rate")
    private Double whiffRate;

    @JsonProperty("strike_pct")
    private Double strikePct;
}
