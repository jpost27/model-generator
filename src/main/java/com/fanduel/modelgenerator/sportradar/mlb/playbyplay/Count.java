
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "balls",
    "strikes",
    "outs",
    "pitch_count"
})
@Generated("jsonschema2pojo")
public class Count {

    @JsonProperty("balls")
    public Integer balls;
    @JsonProperty("strikes")
    public Integer strikes;
    @JsonProperty("outs")
    public Integer outs;
    @JsonProperty("pitch_count")
    public Integer pitchCount;

}
