
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "strike_zone_top",
    "strike_zone_bottom",
    "zone",
    "code",
    "description",
    "coordinates"
})
@Generated("jsonschema2pojo")
public class MlbPitchData {

    @JsonProperty("speed")
    public Double speed;
    @JsonProperty("strike_zone_top")
    public Double strikeZoneTop;
    @JsonProperty("strike_zone_bottom")
    public Double strikeZoneBottom;
    @JsonProperty("zone")
    public Integer zone;
    @JsonProperty("code")
    public String code;
    @JsonProperty("description")
    public String description;
    @JsonProperty("coordinates")
    public Coordinates coordinates;

}
