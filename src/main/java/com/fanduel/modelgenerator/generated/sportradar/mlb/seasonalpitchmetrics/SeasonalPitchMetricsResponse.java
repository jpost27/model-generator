package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeasonalPitchMetricsResponse {
    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("player")
    private Player player;
}