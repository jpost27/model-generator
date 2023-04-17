package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Steal {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("caught")
    private Integer caught;

    @JsonProperty("pickoff")
    private Integer pickoff;

    @JsonProperty("stolen")
    private Integer stolen;
}
