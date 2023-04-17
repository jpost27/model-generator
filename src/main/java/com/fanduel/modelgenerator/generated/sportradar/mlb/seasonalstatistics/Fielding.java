package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Fielding {
    @JsonProperty("overall")
    private Overall overall;

    @JsonProperty("positions")
    private List<Position> positions;
}
