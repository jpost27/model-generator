
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attempts",
    "successes",
    "pct"
})
@Generated("jsonschema2pojo")
public class Thirddown {

    @JsonProperty("attempts")
    public Integer attempts;
    @JsonProperty("successes")
    public Integer successes;
    @JsonProperty("pct")
    public Double pct;

}
