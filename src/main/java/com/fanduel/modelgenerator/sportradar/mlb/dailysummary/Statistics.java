
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hitting",
    "pitching",
    "fielding"
})
@Generated("jsonschema2pojo")
public class Statistics {

    @JsonProperty("hitting")
    public Hitting hitting;
    @JsonProperty("pitching")
    public Pitching pitching;
    @JsonProperty("fielding")
    public Fielding fielding;

}
