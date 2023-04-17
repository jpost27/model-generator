package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class MiscReturns {
    @JsonProperty("touchdowns")
    private Integer touchdowns;

    @JsonProperty("longest_touchdown")
    private Integer longestTouchdown;

    @JsonProperty("fg_return_touchdowns")
    private Integer fgReturnTouchdowns;

    @JsonProperty("ez_rec_touchdowns")
    private Integer ezRecTouchdowns;

    @JsonProperty("returns")
    private Integer returns;

    @JsonProperty("blk_fg_touchdowns")
    private Integer blkFgTouchdowns;

    @JsonProperty("blk_punt_touchdowns")
    private Integer blkPuntTouchdowns;

    @JsonProperty("yards")
    private Integer yards;
}
