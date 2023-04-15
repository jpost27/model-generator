
package com.fanduel.modelgenerator.sportradar.mlb.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "player",
    "_comment"
})
@Generated("jsonschema2pojo")
public class PlayerProfileResponse {

    @JsonProperty("player")
    public Player player;
    @JsonProperty("_comment")
    public String comment;

}
