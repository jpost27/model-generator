
package com.fanduel.modelgenerator.sportradar.mlb.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "sequence",
    "runs",
    "hits",
    "errors",
    "type"
})
@Generated("jsonschema2pojo")
public class Scoring__1 {

    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("hits")
    public Integer hits;
    @JsonProperty("errors")
    public Integer errors;
    @JsonProperty("type")
    public String type;

}
