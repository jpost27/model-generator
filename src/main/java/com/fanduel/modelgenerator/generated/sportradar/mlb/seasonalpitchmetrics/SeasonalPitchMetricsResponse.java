package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

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
public class SeasonalPitchMetricsResponse {
    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("player")
    private Player player;

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(player);
    }
}
