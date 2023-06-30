package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

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
public class Outcome {
    @JsonProperty("foul")
    private Integer foul;

    @JsonProperty("kswing")
    private Integer kswing;

    @JsonProperty("ball")
    private Integer ball;

    @JsonProperty("ktotal")
    private Integer ktotal;

    @JsonProperty("dirtball")
    private Integer dirtball;

    @JsonProperty("klook")
    private Integer klook;

    @JsonProperty("iball")
    private Integer iball;

    public Optional<Integer> getFoul() {
        return Optional.ofNullable(foul);
    }

    public Optional<Integer> getKswing() {
        return Optional.ofNullable(kswing);
    }

    public Optional<Integer> getBall() {
        return Optional.ofNullable(ball);
    }

    public Optional<Integer> getKtotal() {
        return Optional.ofNullable(ktotal);
    }

    public Optional<Integer> getDirtball() {
        return Optional.ofNullable(dirtball);
    }

    public Optional<Integer> getKlook() {
        return Optional.ofNullable(klook);
    }

    public Optional<Integer> getIball() {
        return Optional.ofNullable(iball);
    }
}
