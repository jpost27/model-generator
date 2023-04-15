
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "inning",
    "order",
    "position",
    "sequence",
    "inning_half"
})
@Generated("jsonschema2pojo")
public class Lineup__1 {

    @JsonProperty("id")
    public String id;
    @JsonProperty("inning")
    public Integer inning;
    @JsonProperty("order")
    public Integer order;
    @JsonProperty("position")
    public Integer position;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("inning_half")
    public String inningHalf;

}
