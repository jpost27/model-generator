
package com.fanduel.modelgenerator.sportradar.nfl.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pass",
    "penalty",
    "rush",
    "total"
})
@Generated("jsonschema2pojo")
public class FirstDowns__1 {

    @JsonProperty("pass")
    public Integer pass;
    @JsonProperty("penalty")
    public Integer penalty;
    @JsonProperty("rush")
    public Integer rush;
    @JsonProperty("total")
    public Integer total;

}
