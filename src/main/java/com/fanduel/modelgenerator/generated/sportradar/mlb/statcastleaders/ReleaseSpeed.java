package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ReleaseSpeed {
    @JsonProperty("average")
    private List<Average> average;

    @JsonProperty("max")
    private List<Max> max;
}
