package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Punts {
    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("hang_time")
    private Double hangTime;

    @JsonProperty("avg_hang_time")
    private Double avgHangTime;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("inside_20")
    private Integer inside20;

    @JsonProperty("touchbacks")
    private Integer touchbacks;

    @JsonProperty("attempts")
    private Integer attempts;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("avg_net_yards")
    private Double avgNetYards;

    @JsonProperty("avg_yards")
    private Double avgYards;
}
