package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Draft {
    @JsonProperty("round")
    private Integer round;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("pick")
    private Integer pick;

    @JsonProperty("team_id")
    private String teamId;
}
