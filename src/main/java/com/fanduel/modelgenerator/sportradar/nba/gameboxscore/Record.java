
package com.fanduel.modelgenerator.sportradar.nba.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wins",
    "losses"
})
@Generated("jsonschema2pojo")
public class Record {

    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;

}
