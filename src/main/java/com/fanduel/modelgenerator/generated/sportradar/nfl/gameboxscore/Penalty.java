package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Penalty {
    @JsonProperty("result")
    private String result;

    @JsonProperty("description")
    private String description;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("yards")
    private Integer yards;
}
