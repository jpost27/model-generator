
package com.fanduel.modelgenerator.sportradar.nba.splitshierarchy;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category",
    "conference",
    "total",
    "average",
    "division"
})
@Generated("jsonschema2pojo")
public class Split__1 {

    @JsonProperty("category")
    public String category;
    @JsonProperty("conference")
    public Conference__1 conference;
    @JsonProperty("total")
    public Total__2 total;
    @JsonProperty("average")
    public Average__2 average;
    @JsonProperty("division")
    public Division__1 division;

}
