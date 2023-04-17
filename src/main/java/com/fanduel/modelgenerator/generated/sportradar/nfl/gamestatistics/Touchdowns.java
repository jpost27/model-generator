package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Touchdowns {
    @JsonProperty("kick_return")
    private Integer kickReturn;

    @JsonProperty("fumble_return")
    private Integer fumbleReturn;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("other")
    private Integer other;

    @JsonProperty("punt_return")
    private Integer puntReturn;

    @JsonProperty("pass")
    private Integer pass;

    @JsonProperty("total_return")
    private Integer totalReturn;

    @JsonProperty("int_return")
    private Integer intReturn;

    @JsonProperty("rush")
    private Integer rush;
}
