
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "unearned",
    "earned",
    "ir",
    "ira",
    "bqr",
    "bqra"
})
@Generated("jsonschema2pojo")
public class Runs__5 {

    @JsonProperty("total")
    public Integer total;
    @JsonProperty("unearned")
    public Integer unearned;
    @JsonProperty("earned")
    public Integer earned;
    @JsonProperty("ir")
    public Integer ir;
    @JsonProperty("ira")
    public Integer ira;
    @JsonProperty("bqr")
    public Integer bqr;
    @JsonProperty("bqra")
    public Integer bqra;

}
