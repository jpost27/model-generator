package com.fanduel.modelgenerator.generated.sportradar.mlb.seriessummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class InPlay {
    @JsonProperty("linedrive")
    private Integer linedrive;

    @JsonProperty("popup")
    private Integer popup;

    @JsonProperty("groundball")
    private Integer groundball;

    @JsonProperty("flyball")
    private Integer flyball;
}
