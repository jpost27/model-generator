package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Assists {
    @JsonProperty("outfield")
    private Integer outfield;

    @JsonProperty("total")
    private Integer total;
}
