
package com.fanduel.modelgenerator.sportradar.mlb.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statistics",
    "splits",
    "statcast_metrics"
})
@Generated("jsonschema2pojo")
public class Totals {

    @JsonProperty("statistics")
    public Statistics statistics;
    @JsonProperty("splits")
    public Splits splits;
    @JsonProperty("statcast_metrics")
    public StatcastMetrics statcastMetrics;

}
