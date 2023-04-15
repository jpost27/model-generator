
package com.fanduel.modelgenerator.sportradar.nfl.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "result",
    "type"
})
@Generated("jsonschema2pojo")
public class Review {

    @JsonProperty("result")
    public String result;
    @JsonProperty("type")
    public String type;

}
