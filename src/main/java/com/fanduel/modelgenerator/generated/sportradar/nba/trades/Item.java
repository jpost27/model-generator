package com.fanduel.modelgenerator.generated.sportradar.nba.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Item {
    @JsonProperty("amount")
    private String amount;

    @JsonProperty("pick")
    private Pick pick;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("future_pick")
    private FuturePick futurePick;

    @JsonProperty("player")
    private Player player;

    public Optional<String> getAmount() {
        return Optional.ofNullable(amount);
    }

    public Optional<Pick> getPick() {
        return Optional.ofNullable(pick);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<FuturePick> getFuturePick() {
        return Optional.ofNullable(futurePick);
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(player);
    }
}
