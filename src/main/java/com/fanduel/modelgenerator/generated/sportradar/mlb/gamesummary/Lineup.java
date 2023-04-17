package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Lineup {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("order")
    private Integer order;
}
