package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<Boolean> getIsPassedBall() {
        return Optional.ofNullable(isPassedBall);
    }

    public Optional<Boolean> getIsAbOver() {
        return Optional.ofNullable(isAbOver);
    }

    public Optional<Boolean> getIsBunt() {
        return Optional.ofNullable(isBunt);
    }

    public Optional<Boolean> getIsHit() {
        return Optional.ofNullable(isHit);
    }

    public Optional<Boolean> getIsWildPitch() {
        return Optional.ofNullable(isWildPitch);
    }

    public Optional<Boolean> getIsDoublePlay() {
        return Optional.ofNullable(isDoublePlay);
    }

    public Optional<Boolean> getIsTriplePlay() {
        return Optional.ofNullable(isTriplePlay);
    }
}
