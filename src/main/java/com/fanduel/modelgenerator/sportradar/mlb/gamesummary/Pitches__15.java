
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "btotal",
    "ktotal"
})
@Generated("jsonschema2pojo")
public class Pitches__15 {

    @JsonProperty("count")
    public Integer count;
    @JsonProperty("btotal")
    public Integer btotal;
    @JsonProperty("ktotal")
    public Integer ktotal;

}
