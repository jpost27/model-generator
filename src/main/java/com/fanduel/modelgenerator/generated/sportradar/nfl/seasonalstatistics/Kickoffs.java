package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Kickoffs {
    @JsonProperty("endzone")
    private Integer endzone;

    @JsonProperty("onside_successes")
    private Integer onsideSuccesses;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("inside_20")
    private Integer inside20;

    @JsonProperty("kickoffs")
    private Integer kickoffs;

    @JsonProperty("onside_attempts")
    private Integer onsideAttempts;

    @JsonProperty("squib_kicks")
    private Integer squibKicks;

    @JsonProperty("returned")
    private Integer returned;

    @JsonProperty("touchbacks")
    private Integer touchbacks;

    @JsonProperty("out_of_bounds")
    private Integer outOfBounds;

    @JsonProperty("yards")
    private Integer yards;
}
