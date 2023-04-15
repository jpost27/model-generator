
package com.fanduel.modelgenerator.sportradar.mlb.dailysummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "po",
    "a",
    "dp",
    "tp",
    "error",
    "tc",
    "fpct",
    "c_wp",
    "pb",
    "steal",
    "errors",
    "assists"
})
@Generated("jsonschema2pojo")
public class Overall__2 {

    @JsonProperty("po")
    public Integer po;
    @JsonProperty("a")
    public Integer a;
    @JsonProperty("dp")
    public Integer dp;
    @JsonProperty("tp")
    public Integer tp;
    @JsonProperty("error")
    public Integer error;
    @JsonProperty("tc")
    public Integer tc;
    @JsonProperty("fpct")
    public Double fpct;
    @JsonProperty("c_wp")
    public Integer cWp;
    @JsonProperty("pb")
    public Integer pb;
    @JsonProperty("steal")
    public Steal__4 steal;
    @JsonProperty("errors")
    public Errors errors;
    @JsonProperty("assists")
    public Assists assists;

}
