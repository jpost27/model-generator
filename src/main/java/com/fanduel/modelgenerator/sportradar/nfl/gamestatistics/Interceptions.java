
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "return_yards",
    "returned",
    "number"
})
@Generated("jsonschema2pojo")
public class Interceptions {

    @JsonProperty("return_yards")
    public Integer returnYards;
    @JsonProperty("returned")
    public Integer returned;
    @JsonProperty("number")
    public Integer number;

}
