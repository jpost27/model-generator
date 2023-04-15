
package com.fanduel.modelgenerator.sportradar.mlb.gamepitchmetrics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "swing_rate",
    "strike_pct",
    "whiff_rate"
})
@Generated("jsonschema2pojo")
public class Swings__2 {

    @JsonProperty("total")
    public Integer total;
    @JsonProperty("swing_rate")
    public Double swingRate;
    @JsonProperty("strike_pct")
    public Double strikePct;
    @JsonProperty("whiff_rate")
    public Double whiffRate;

}
