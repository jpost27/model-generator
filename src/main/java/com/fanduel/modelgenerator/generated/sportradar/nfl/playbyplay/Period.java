package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Period {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("scoring")
    private Scoring scoring;

    @JsonProperty("period_type")
    private String periodType;

    @JsonProperty("coin_toss")
    private CoinToss coinToss;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pbp")
    private List<Pbp> pbp;
}
