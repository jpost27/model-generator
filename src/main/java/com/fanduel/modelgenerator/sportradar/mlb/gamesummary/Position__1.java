
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

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
    "rf",
    "inn_1",
    "inn_2",
    "position",
    "steal",
    "errors",
    "assists",
    "games"
})
@Generated("jsonschema2pojo")
public class Position__1 {

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
    @JsonProperty("rf")
    public Double rf;
    @JsonProperty("inn_1")
    public Integer inn1;
    @JsonProperty("inn_2")
    public Double inn2;
    @JsonProperty("position")
    public String position;
    @JsonProperty("steal")
    public Steal__20 steal;
    @JsonProperty("errors")
    public Errors__5 errors;
    @JsonProperty("assists")
    public Assists__5 assists;
    @JsonProperty("games")
    public Games__16 games;

}
