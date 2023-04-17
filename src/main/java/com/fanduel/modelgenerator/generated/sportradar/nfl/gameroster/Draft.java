package com.fanduel.modelgenerator.generated.sportradar.nfl.gameroster;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Draft {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("round")
    private Integer round;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("team")
    private Team team;
}
