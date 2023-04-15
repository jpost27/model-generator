
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hitting",
    "fielding",
    "pitching"
})
@Generated("jsonschema2pojo")
public class Statistics__1 {

    @JsonProperty("hitting")
    public Hitting__1 hitting;
    @JsonProperty("fielding")
    public Fielding__1 fielding;
    @JsonProperty("pitching")
    public Pitching__1 pitching;

}
