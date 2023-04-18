package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalfaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Strength {
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("lost")
    private Integer lost;

    @JsonProperty("won")
    private Integer won;

    @JsonProperty("type")
    private String type;

    @JsonProperty("win_pct")
    private Double winPct;
}
