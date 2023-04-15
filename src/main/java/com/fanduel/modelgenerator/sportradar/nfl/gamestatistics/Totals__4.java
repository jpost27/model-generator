
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "penalties",
    "yards",
    "first_downs"
})
@Generated("jsonschema2pojo")
public class Totals__4 {

    @JsonProperty("penalties")
    public Integer penalties;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("first_downs")
    public Integer firstDowns;

}
