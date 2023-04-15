
package com.fanduel.modelgenerator.sportradar.nba.leaguehierarchy;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hex_color",
    "rgb_color"
})
@Generated("jsonschema2pojo")
public class TeamColor {

    @JsonProperty("type")
    public String type;
    @JsonProperty("hex_color")
    public String hexColor;
    @JsonProperty("rgb_color")
    public RgbColor rgbColor;

}
