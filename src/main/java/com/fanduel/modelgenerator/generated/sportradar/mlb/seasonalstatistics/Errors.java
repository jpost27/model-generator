package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Errors {
    @JsonProperty("throwing")
    private Integer throwing;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("fielding")
    private Integer fielding;

    @JsonProperty("interference")
    private Integer interference;
}
