
package com.fanduel.modelgenerator.sportradar.mlb.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "game",
    "_comment"
})
@Generated("jsonschema2pojo")
public class GameBoxscoreResponse {

    @JsonProperty("game")
    public Game game;
    @JsonProperty("_comment")
    public String comment;

}
