package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Flags {
    @JsonProperty("is_passed_ball")
    private Integer isPassedBall;

    @JsonProperty("is_ab_over")
    private Integer isAbOver;

    @JsonProperty("is_bunt")
    private Integer isBunt;

    @JsonProperty("is_hit")
    private Integer isHit;

    @JsonProperty("is_wild_pitch")
    private Integer isWildPitch;

    @JsonProperty("is_double_play")
    private Integer isDoublePlay;

    @JsonProperty("is_triple_play")
    private Integer isTriplePlay;
}
