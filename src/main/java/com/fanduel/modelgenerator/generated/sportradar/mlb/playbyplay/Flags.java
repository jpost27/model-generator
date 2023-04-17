package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Flags {
    @JsonProperty("is_passed_ball")
    private Boolean isPassedBall;

    @JsonProperty("is_ab_over")
    private Boolean isAbOver;

    @JsonProperty("is_bunt")
    private Boolean isBunt;

    @JsonProperty("is_hit")
    private Boolean isHit;

    @JsonProperty("is_wild_pitch")
    private Boolean isWildPitch;

    @JsonProperty("is_double_play")
    private Boolean isDoublePlay;

    @JsonProperty("is_triple_play")
    private Boolean isTriplePlay;
}
