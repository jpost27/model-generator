package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

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
public class Statistics {
    @JsonProperty("pitch_metrics")
    private PitchMetrics pitchMetrics;

    public Optional<PitchMetrics> getPitchMetrics() {
        return Optional.ofNullable(pitchMetrics);
    }
}
