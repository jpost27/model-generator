package com.fanduel.modelgenerator.generated.sportradar.nba.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TeamColor {
    @JsonProperty("rgb_color")
    private RgbColor rgbColor;

    @JsonProperty("hex_color")
    private String hexColor;

    @JsonProperty("type")
    private String type;
}
