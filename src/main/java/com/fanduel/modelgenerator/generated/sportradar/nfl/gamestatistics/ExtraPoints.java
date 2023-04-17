package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ExtraPoints {
    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("kicks")
    private Kicks kicks;
}
