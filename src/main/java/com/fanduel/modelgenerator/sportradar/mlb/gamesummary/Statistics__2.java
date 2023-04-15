
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hitting",
    "pitching",
    "fielding"
})
@Generated("jsonschema2pojo")
public class Statistics__2 {

    @JsonProperty("hitting")
    public Hitting__2 hitting;
    @JsonProperty("pitching")
    public Pitching__2 pitching;
    @JsonProperty("fielding")
    public Fielding__2 fielding;

}
