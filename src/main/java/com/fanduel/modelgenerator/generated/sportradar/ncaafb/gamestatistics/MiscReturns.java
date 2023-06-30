package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
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
public class MiscReturns {
    @JsonProperty("players")
    private List<Object> players;

    @JsonProperty("totals")
    private Totals totals;

    public List<Object> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<Totals> getTotals() {
        return Optional.ofNullable(totals);
    }
}
