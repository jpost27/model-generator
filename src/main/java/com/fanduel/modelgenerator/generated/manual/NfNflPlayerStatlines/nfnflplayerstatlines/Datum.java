package com.fanduel.modelgenerator.generated.manual.NfNflPlayerStatlines.nfnflplayerstatlines;

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
public class Datum {
    @JsonProperty("statlines")
    private List<Statline> statlines;

    @JsonProperty("player")
    private Player player;

    public List<Statline> getStatlines() {
        return Optional.ofNullable(statlines).orElse(Collections.emptyList());
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(player);
    }
}
