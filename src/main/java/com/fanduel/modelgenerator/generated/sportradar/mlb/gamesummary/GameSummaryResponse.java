package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GameSummaryResponse {
    @JsonProperty("game")
    private Game game;

    @JsonProperty("_comment")
    private String comment;
}