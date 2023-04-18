package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesfaceoffs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Powerplay {
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("strength")
    private List<Strength> strength;

    @JsonProperty("lost")
    private Integer lost;

    @JsonProperty("won")
    private Integer won;

    @JsonProperty("win_pct")
    private Double winPct;
}
