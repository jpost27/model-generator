
package com.fanduel.modelgenerator.sportradar.mlb.gamepitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "h",
    "s",
    "d",
    "t",
    "hr"
})
@Generated("jsonschema2pojo")
public class Onbase__2 {

    @JsonProperty("h")
    public Integer h;
    @JsonProperty("s")
    public Integer s;
    @JsonProperty("d")
    public Integer d;
    @JsonProperty("t")
    public Integer t;
    @JsonProperty("hr")
    public Integer hr;

}
