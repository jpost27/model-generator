
package com.fanduel.modelgenerator.sportradar.nba.splitsschedule;

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
public class Opponents {

    @JsonProperty("total")
    public Total__1 total;
    @JsonProperty("average")
    public Average__1 average;

}
