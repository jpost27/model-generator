package com.fanduel.modelgenerator.generated.sportradar.nhl.gameshotzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Scoring {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("type")
    private String type;

    @JsonProperty("points")
    private Integer points;
}
