
package com.fanduel.modelgenerator.sportradar.mlb.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "count",
    "min",
    "avg",
    "max"
})
@Generated("jsonschema2pojo")
public class HomerunDistance {

    @JsonProperty("count")
    public Integer count;
    @JsonProperty("min")
    public Double min;
    @JsonProperty("avg")
    public Double avg;
    @JsonProperty("max")
    public Double max;

}
