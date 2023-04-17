package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class EndSituation {
    @JsonProperty("yfd")
    private Integer yfd;

    @JsonProperty("possession")
    private Possession possession;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("down")
    private Integer down;
}
