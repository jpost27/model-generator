package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class KickReturns {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest")
    private Integer longest;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("returns")
    private Integer returns;

    @JsonProperty("avg_yards")
    private Double avgYards;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("faircatches")
    private Integer faircatches;
}
