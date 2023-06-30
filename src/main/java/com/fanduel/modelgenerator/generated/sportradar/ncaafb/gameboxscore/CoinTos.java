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
public class CoinTos {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("quarter")
    private Integer quarter;

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }

    public Optional<Integer> getQuarter() {
        return Optional.ofNullable(quarter);
    }
}
