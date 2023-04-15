
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "blocked",
    "made",
    "missed",
    "pct"
})
@Generated("jsonschema2pojo")
public class Totals__28 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("pct")
    public Double pct;

}
