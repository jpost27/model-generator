package com.fanduel.modelgenerator.generated.nflv7.trades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Item {
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
