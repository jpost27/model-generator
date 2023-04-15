
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "throwing",
    "fielding",
    "interference",
    "total"
})
@Generated("jsonschema2pojo")
public class Errors__5 {

    @JsonProperty("throwing")
    public Integer throwing;
    @JsonProperty("fielding")
    public Integer fielding;
    @JsonProperty("interference")
    public Integer interference;
    @JsonProperty("total")
    public Integer total;

}
