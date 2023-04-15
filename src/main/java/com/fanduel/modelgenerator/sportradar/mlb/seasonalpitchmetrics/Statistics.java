
package com.fanduel.modelgenerator.sportradar.mlb.seasonalpitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pitch_metrics"
})
@Generated("jsonschema2pojo")
public class Statistics {

    @JsonProperty("pitch_metrics")
    public PitchMetrics pitchMetrics;

}
