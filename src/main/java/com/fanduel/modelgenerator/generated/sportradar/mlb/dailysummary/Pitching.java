package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
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

    @JsonProperty("blown_save")
    private List<BlownSave> blownSave;

    @JsonProperty("bullpen")
    private Bullpen bullpen;

    @JsonProperty("starters")
    private Starters starters;

    @JsonProperty("save")
    private Save save;

    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("win")
    private Win win;

    @JsonProperty("hold")
    private List<Hold> hold;

    public Optional<Loss> getLoss() {
        return Optional.ofNullable(loss);
    }

    public List<BlownSave> getBlownSave() {
        return Optional.ofNullable(blownSave).orElse(Collections.emptyList());
    }

    public Optional<Bullpen> getBullpen() {
        return Optional.ofNullable(bullpen);
    }

    public Optional<Starters> getStarters() {
        return Optional.ofNullable(starters);
    }

    public Optional<Save> getSave() {
        return Optional.ofNullable(save);
    }

    public Optional<Overall> getOverall() {
        return Optional.ofNullable(overall);
    }

    public Optional<Win> getWin() {
        return Optional.ofNullable(win);
    }

    public List<Hold> getHold() {
        return Optional.ofNullable(hold).orElse(Collections.emptyList());
    }
}
