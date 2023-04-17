package com.fanduel.modelgenerator.generated.sportradar.mlb.gamepitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Outs {
    @JsonProperty("kswing")
    private Integer kswing;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("klook")
    private Integer klook;
}
