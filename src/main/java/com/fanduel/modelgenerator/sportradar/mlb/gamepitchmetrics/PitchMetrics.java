
package com.fanduel.modelgenerator.sportradar.mlb.gamepitchmetrics;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overall",
    "pitch_types"
})
@Generated("jsonschema2pojo")
public class PitchMetrics {

    @JsonProperty("overall")
    public Overall overall;
    @JsonProperty("pitch_types")
    public List<PitchType> pitchTypes = new ArrayList<PitchType>();

}
