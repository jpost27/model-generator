package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Pitching {
    @JsonProperty("loss")
    private Loss loss;

    @JsonProperty("win")
    private Win win;

    public Optional<Loss> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<Win> getWin() {
        return Optional.ofNullable(win);
    }
}
