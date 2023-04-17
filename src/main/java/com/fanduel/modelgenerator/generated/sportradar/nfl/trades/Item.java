package com.fanduel.modelgenerator.generated.sportradar.nfl.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
