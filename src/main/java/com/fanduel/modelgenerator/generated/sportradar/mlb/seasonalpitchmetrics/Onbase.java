package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Onbase {
    @JsonProperty("s")
    private Integer s;

    @JsonProperty("d")
    private Integer d;

    @JsonProperty("t")
    private Integer t;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("hr")
    private Integer hr;
}
