
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caught",
    "stolen",
    "pct",
    "pickoff"
})
@Generated("jsonschema2pojo")
public class Steal__11 {

    @JsonProperty("caught")
    public Integer caught;
    @JsonProperty("stolen")
    public Integer stolen;
    @JsonProperty("pct")
    public Integer pct;
    @JsonProperty("pickoff")
    public Integer pickoff;

}
