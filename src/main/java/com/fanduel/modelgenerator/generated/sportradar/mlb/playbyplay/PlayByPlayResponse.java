package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class PlayByPlayResponse {
    @JsonProperty("game")
    private Game game;

    @JsonProperty("_comment")
    private String comment;
}
