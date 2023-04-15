
package com.fanduel.modelgenerator.sportradar.mlb.seasonalsplits;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hitting",
    "pitching"
})
@Generated("jsonschema2pojo")
public class Splits {

    @JsonProperty("hitting")
    public Hitting hitting;
    @JsonProperty("pitching")
    public Pitching pitching;

}
