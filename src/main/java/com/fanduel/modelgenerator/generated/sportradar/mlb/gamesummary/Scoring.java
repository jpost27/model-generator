package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Scoring {
    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("type")
    private String type;

    @JsonProperty("runs")
    private Integer runs;

    @JsonProperty("errors")
    private Integer errors;
}
