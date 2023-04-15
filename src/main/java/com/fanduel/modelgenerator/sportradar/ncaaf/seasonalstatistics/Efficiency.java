
package com.fanduel.modelgenerator.sportradar.ncaaf.seasonalstatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "goaltogo",
    "redzone",
    "thirddown",
    "fourthdown"
})
@Generated("jsonschema2pojo")
public class Efficiency {

    @JsonProperty("goaltogo")
    public Goaltogo goaltogo;
    @JsonProperty("redzone")
    public Redzone redzone;
    @JsonProperty("thirddown")
    public Thirddown thirddown;
    @JsonProperty("fourthdown")
    public Fourthdown fourthdown;

}
