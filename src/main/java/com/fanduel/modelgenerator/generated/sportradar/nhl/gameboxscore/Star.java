package com.fanduel.modelgenerator.generated.sportradar.nhl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Star {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("player")
    private Player player;
}
