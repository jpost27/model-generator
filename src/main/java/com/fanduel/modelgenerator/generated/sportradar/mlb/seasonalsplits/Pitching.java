package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitching {
    @JsonProperty("bullpen")
    private List<Bullpen> bullpen;

    @JsonProperty("starters")
    private List<Starter> starters;

    @JsonProperty("overall")
    private List<Overall> overall;
}
