
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "sequence",
    "halfs",
    "scoring"
})
@Generated("jsonschema2pojo")
public class Inning {

    @JsonProperty("number")
    public Integer number;
    @JsonProperty("sequence")
    public Integer sequence;
    @JsonProperty("halfs")
    public List<Half> halfs = new ArrayList<Half>();
    @JsonProperty("scoring")
    public Scoring__1 scoring;

}
