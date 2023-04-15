
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "linedrive",
    "groundball",
    "popup",
    "flyball"
})
@Generated("jsonschema2pojo")
public class InPlay__12 {

    @JsonProperty("linedrive")
    public Integer linedrive;
    @JsonProperty("groundball")
    public Integer groundball;
    @JsonProperty("popup")
    public Integer popup;
    @JsonProperty("flyball")
    public Integer flyball;

}
