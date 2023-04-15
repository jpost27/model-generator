
package com.fanduel.modelgenerator.sportradar.mlb.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "win",
    "loss"
})
@Generated("jsonschema2pojo")
public class Pitching {

    @JsonProperty("win")
    public Win win;
    @JsonProperty("loss")
    public Loss loss;

}
