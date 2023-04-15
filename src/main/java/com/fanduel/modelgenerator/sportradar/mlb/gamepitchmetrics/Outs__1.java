
package com.fanduel.modelgenerator.sportradar.mlb.gamepitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "klook",
    "kswing",
    "ktotal"
})
@Generated("jsonschema2pojo")
public class Outs__1 {

    @JsonProperty("klook")
    public Integer klook;
    @JsonProperty("kswing")
    public Integer kswing;
    @JsonProperty("ktotal")
    public Integer ktotal;

}
