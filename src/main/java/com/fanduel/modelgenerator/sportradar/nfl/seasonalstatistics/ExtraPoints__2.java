
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "made",
    "blocked",
    "missed",
    "pct"
})
@Generated("jsonschema2pojo")
public class ExtraPoints__2 {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("pct")
    public Double pct;

}
