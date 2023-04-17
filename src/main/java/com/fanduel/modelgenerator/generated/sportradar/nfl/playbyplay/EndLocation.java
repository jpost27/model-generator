package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class EndLocation {
    @JsonProperty("yardline")
    private Integer yardline;

    @JsonProperty("alias")
    private String alias;
}
