package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ExtraPoints {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("missed")
    private Integer missed;

    @JsonProperty("kicks")
    private Kicks kicks;

    @JsonProperty("attempts")
    private Integer attempts;
}
