package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class PointsAfterPlay {
    @JsonProperty("sequence")
    private Double sequence;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;
}