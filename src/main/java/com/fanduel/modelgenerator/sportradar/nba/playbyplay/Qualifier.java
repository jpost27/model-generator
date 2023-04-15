
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "qualifier"
})
@Generated("jsonschema2pojo")
public class Qualifier {

    @JsonProperty("qualifier")
    public String qualifier;

}
