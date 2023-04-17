package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class MlbPitchData {
    @JsonProperty("code")
    private String code;

    @JsonProperty("zone")
    private Integer zone;

    @JsonProperty("coordinates")
    private Coordinates coordinates;

    @JsonProperty("description")
    private String description;

    @JsonProperty("strike_zone_top")
    private Double strikeZoneTop;

    @JsonProperty("strike_zone_bottom")
    private Double strikeZoneBottom;

    @JsonProperty("speed")
    private Double speed;
}
