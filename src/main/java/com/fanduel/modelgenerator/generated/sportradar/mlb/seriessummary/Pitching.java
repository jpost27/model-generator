package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

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
    @JsonProperty("starters")
    private Starters starters;

    @JsonProperty("bullpen")
    private Bullpen bullpen;

    @JsonProperty("overall")
    private Overall overall;

    public Optional<Starters> getStarters() {
        return Optional.ofNullable(starters);
    }

    public Optional<Bullpen> getBullpen() {
        return Optional.ofNullable(bullpen);
    }

    public Optional<Overall> getOverall() {
        return Optional.ofNullable(overall);
    }
}
