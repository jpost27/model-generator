
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
public class PitchMetrics__1 {

    @JsonProperty("overall")
    public Overall__1 overall;
    @JsonProperty("pitch_types")
    public List<PitchType__1> pitchTypes = new ArrayList<PitchType__1>();

}
