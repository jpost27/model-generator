
package com.fanduel.modelgenerator.sportradar.nfl.trades;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "pick",
    "future_pick",
    "player"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("id")
    public String id;
    @JsonProperty("type")
    public String type;
    @JsonProperty("pick")
    public Pick pick;
    @JsonProperty("future_pick")
    public FuturePick futurePick;
    @JsonProperty("player")
    public Player player;

}
