package com.fanduel.modelgenerator.generated.sportradar.mlb.gamepitchmetrics;

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
public class PitchMetrics {
    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("pitch_types")
    private List<PitchType> pitchTypes;

    public Optional<Overall> getOverall() {
        return Optional.ofNullable(overall);
    }

    public List<PitchType> getPitchTypes() {
        return Optional.ofNullable(pitchTypes).orElse(Collections.emptyList());
    }
}
