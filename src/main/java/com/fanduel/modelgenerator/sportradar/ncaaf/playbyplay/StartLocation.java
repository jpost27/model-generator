
package com.fanduel.modelgenerator.sportradar.ncaaf.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alias",
    "yardline"
})
@Generated("jsonschema2pojo")
public class StartLocation {

    @JsonProperty("alias")
    public String alias;
    @JsonProperty("yardline")
    public Integer yardline;

}
