package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Outcome {
    @JsonProperty("foul")
    private Integer foul;

    @JsonProperty("kswing")
    private Integer kswing;

    @JsonProperty("ball")
    private Integer ball;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("dirtball")
    private Integer dirtball;

    @JsonProperty("klook")
    private Integer klook;

    @JsonProperty("iball")
    private Integer iball;
}
