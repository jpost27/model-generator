package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Pitching {
    @JsonProperty("bullpen")
    private List<Bullpen> bullpen;

    @JsonProperty("starters")
    private List<Starter> starters;

    @JsonProperty("overall")
    private List<Overall> overall;

    public List<Bullpen> getBullpen() {
        return Optional.ofNullable(bullpen).orElse(Collections.emptyList());
    }

    public List<Starter> getStarters() {
        return Optional.ofNullable(starters).orElse(Collections.emptyList());
    }

    public List<Overall> getOverall() {
        return Optional.ofNullable(overall).orElse(Collections.emptyList());
    }
}
