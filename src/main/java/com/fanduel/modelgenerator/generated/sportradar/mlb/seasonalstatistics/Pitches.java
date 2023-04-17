package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitches {
    @JsonProperty("btotal")
    private Integer btotal;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("per_bf")
    private Double perBf;

    @JsonProperty("per_start")
    private Double perStart;

    @JsonProperty("per_ip")
    private Double perIp;
}
