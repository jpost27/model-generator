package com.fanduel.modelgenerator.generated.sportradar.nhl.gameanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ShotsByType {
    @JsonProperty("pct")
    private Double pct;

    @JsonProperty("type")
    private String type;
}
