
package com.fanduel.modelgenerator.sportradar.mlb.seasonalpitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "klook",
    "kswing",
    "ktotal",
    "foul",
    "btotal"
})
@Generated("jsonschema2pojo")
public class Outcome__1 {

    @JsonProperty("klook")
    public Integer klook;
    @JsonProperty("kswing")
    public Integer kswing;
    @JsonProperty("ktotal")
    public Integer ktotal;
    @JsonProperty("foul")
    public Integer foul;
    @JsonProperty("btotal")
    public Integer btotal;

}
