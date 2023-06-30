package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gameboxscore;

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
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("losses")
    private Integer losses;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getTies() {
        return Optional.ofNullable(ties);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }
}
