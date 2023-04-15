
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "blocked",
    "made",
    "pct"
})
@Generated("jsonschema2pojo")
public class Kicks {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("pct")
    public Double pct;

}
