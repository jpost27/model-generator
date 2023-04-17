package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitching {
    @JsonProperty("starters")
    private Starters starters;

    @JsonProperty("bullpen")
    private Bullpen bullpen;

    @JsonProperty("overall")
    private Overall overall;
}
