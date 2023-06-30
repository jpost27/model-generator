package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

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

    @JsonProperty("bullpen")
    private Bullpen bullpen;

    @JsonProperty("starters")
    private Starters starters;

    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("win")
    private Win win;

    public Optional<Loss> getLoss() {
        return Optional.ofNullable(loss);
    }

    public Optional<Bullpen> getBullpen() {
        return Optional.ofNullable(bullpen);
    }

    public Optional<Starters> getStarters() {
        return Optional.ofNullable(starters);
    }

    public Optional<Overall> getOverall() {
        return Optional.ofNullable(overall);
    }

    public Optional<Win> getWin() {
        return Optional.ofNullable(win);
    }
}
