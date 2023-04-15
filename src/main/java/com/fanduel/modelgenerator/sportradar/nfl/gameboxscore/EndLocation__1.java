
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alias",
    "yardline"
})
@Generated("jsonschema2pojo")
public class EndLocation__1 {

    @JsonProperty("alias")
    public String alias;
    @JsonProperty("yardline")
    public Integer yardline;

}
