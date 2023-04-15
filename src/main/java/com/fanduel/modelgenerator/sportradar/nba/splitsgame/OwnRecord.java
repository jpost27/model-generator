
package com.fanduel.modelgenerator.sportradar.nba.splitsgame;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "average"
})
@Generated("jsonschema2pojo")
public class OwnRecord {

    @JsonProperty("total")
    public Total total;
    @JsonProperty("average")
    public Average average;

}
