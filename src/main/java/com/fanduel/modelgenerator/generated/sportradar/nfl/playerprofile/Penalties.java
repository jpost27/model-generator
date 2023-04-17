package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Penalties {
    @JsonProperty("penalties")
    private Integer penalties;

    @JsonProperty("first_downs")
    private Integer firstDowns;

    @JsonProperty("yards")
    private Integer yards;
}
