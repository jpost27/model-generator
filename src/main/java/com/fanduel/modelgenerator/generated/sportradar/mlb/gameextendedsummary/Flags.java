package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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

    public Optional<Integer> getIsPassedBall() {
        return Optional.ofNullable(isPassedBall);
    }

    public Optional<Integer> getIsAbOver() {
        return Optional.ofNullable(isAbOver);
    }

    public Optional<Integer> getIsBunt() {
        return Optional.ofNullable(isBunt);
    }

    public Optional<Integer> getIsHit() {
        return Optional.ofNullable(isHit);
    }

    public Optional<Integer> getIsWildPitch() {
        return Optional.ofNullable(isWildPitch);
    }

    public Optional<Integer> getIsDoublePlay() {
        return Optional.ofNullable(isDoublePlay);
    }

    public Optional<Integer> getIsTriplePlay() {
        return Optional.ofNullable(isTriplePlay);
    }
}
