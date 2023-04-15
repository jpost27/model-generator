
package com.fanduel.modelgenerator.sportradar.nba.splitsingame;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "total",
    "average"
})
@Generated("jsonschema2pojo")
public class Split__1 {

    @JsonProperty("category")
    public String category;
    @JsonProperty("total")
    public Total__2 total;
    @JsonProperty("average")
    public Average__2 average;

}
