package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Games {
    @JsonProperty("play")
    private Integer play;

    @JsonProperty("start")
    private Integer start;

    @JsonProperty("finish")
    private Integer finish;

    @JsonProperty("complete")
    private Integer complete;
}
