
package com.fanduel.modelgenerator.sportradar.ncaaf.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outcome",
    "decision"
})
@Generated("jsonschema2pojo")
public class Away__2 {

    @JsonProperty("outcome")
    public String outcome;
    @JsonProperty("decision")
    public String decision;

}
