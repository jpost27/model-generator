package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class GameSummaryResponse {
    @JsonProperty("game")
    private Game game;

    @JsonProperty("_comment")
    private String comment;

    public Optional<Game> getGame() {
        return Optional.ofNullable(game);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }
}
