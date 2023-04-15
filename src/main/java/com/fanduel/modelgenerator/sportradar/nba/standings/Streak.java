
package com.fanduel.modelgenerator.sportradar.nba.standings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "length"
})
@Generated("jsonschema2pojo")
public class Streak {

    @JsonProperty("kind")
    public String kind;
    @JsonProperty("length")
    public Integer length;

}
