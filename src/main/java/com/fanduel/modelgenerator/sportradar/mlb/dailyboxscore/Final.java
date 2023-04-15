
package com.fanduel.modelgenerator.sportradar.mlb.dailyboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inning",
    "inning_half"
})
@Generated("jsonschema2pojo")
public class Final {

    @JsonProperty("inning")
    public Integer inning;
    @JsonProperty("inning_half")
    public String inningHalf;

}
