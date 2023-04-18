package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class OwnRecord {
    @JsonProperty("shootout")
    private Shootout shootout;

    @JsonProperty("goaltending")
    private Goaltending goaltending;

    @JsonProperty("statistics")
    private Statistics statistics;
}
