package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Receiving {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("totals")
    private Totals totals;

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<Totals> getTotals() {
        return Optional.ofNullable(totals);
    }
}
