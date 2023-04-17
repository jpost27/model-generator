package com.fanduel.modelgenerator.generated.sportradar.mlb.gamepitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class PitchType {
    @JsonProperty("outs")
    private Outs outs;

    @JsonProperty("onbase")
    private Onbase onbase;

    @JsonProperty("gbfb")
    private Integer gbfb;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("in_play")
    private InPlay inPlay;

    @JsonProperty("max_speed")
    private Double maxSpeed;

    @JsonProperty("type")
    private String type;

    @JsonProperty("min_speed")
    private Double minSpeed;

    @JsonProperty("outcome")
    private Outcome outcome;

    @JsonProperty("swings")
    private Swings swings;

    @JsonProperty("avg_speed")
    private Double avgSpeed;
}
