
package com.fanduel.modelgenerator.sportradar.mlb.standings;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "division",
    "league"
})
@Generated("jsonschema2pojo")
public class Rank {

    @JsonProperty("division")
    public Integer division;
    @JsonProperty("league")
    public Integer league;

}
