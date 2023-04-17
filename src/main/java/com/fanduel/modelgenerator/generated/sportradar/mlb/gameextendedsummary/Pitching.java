package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitching {
    @JsonProperty("loss")
    private Loss loss;

    @JsonProperty("seasontd")
    private Seasontd seasontd;

    @JsonProperty("bullpen")
    private Bullpen bullpen;

    @JsonProperty("starters")
    private Starters starters;

    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("win")
    private Win win;
}
