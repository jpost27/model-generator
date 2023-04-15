
package com.fanduel.modelgenerator.sportradar.nba.splitsgame;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "total",
    "average",
    "opponent",
    "venue",
    "position"
})
@Generated("jsonschema2pojo")
public class Split__1 {

    @JsonProperty("category")
    public String category;
    @JsonProperty("total")
    public Total__2 total;
    @JsonProperty("average")
    public Average__2 average;
    @JsonProperty("opponent")
    public Opponent__1 opponent;
    @JsonProperty("venue")
    public Venue__1 venue;
    @JsonProperty("position")
    public String position;

}
