
package com.fanduel.modelgenerator.sportradar.mlb.seriesstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caught",
    "stolen",
    "pickoff",
    "pct"
})
@Generated("jsonschema2pojo")
public class Steal__6 {

    @JsonProperty("caught")
    public Integer caught;
    @JsonProperty("stolen")
    public Integer stolen;
    @JsonProperty("pickoff")
    public Integer pickoff;
    @JsonProperty("pct")
    public Integer pct;

}
