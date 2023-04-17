package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class FirstDowns {
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("pass")
    private Integer pass;

    @JsonProperty("penalty")
    private Integer penalty;

    @JsonProperty("rush")
    private Integer rush;
}
