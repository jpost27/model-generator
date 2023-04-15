
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "avg_yards",
    "yards",
    "longest",
    "touchdowns",
    "faircatches",
    "number"
})
@Generated("jsonschema2pojo")
public class Totals__3 {

    @JsonProperty("avg_yards")
    public Double avgYards;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("longest")
    public Integer longest;
    @JsonProperty("touchdowns")
    public Integer touchdowns;
    @JsonProperty("faircatches")
    public Integer faircatches;
    @JsonProperty("number")
    public Integer number;

}
