package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class PitchMetrics {
    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("pitch_types")
    private List<PitchType> pitchTypes;
}
