package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Draft {
    @JsonProperty("round")
    private String round;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("pick")
    private String pick;

    @JsonProperty("team_id")
    private String teamId;
}
