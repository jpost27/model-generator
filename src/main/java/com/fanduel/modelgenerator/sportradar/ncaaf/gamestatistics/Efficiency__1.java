
package com.fanduel.modelgenerator.sportradar.ncaaf.gamestatistics;

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
public class Efficiency__1 {

    @JsonProperty("goaltogo")
    public Goaltogo__1 goaltogo;
    @JsonProperty("redzone")
    public Redzone__1 redzone;
    @JsonProperty("thirddown")
    public Thirddown__1 thirddown;
    @JsonProperty("fourthdown")
    public Fourthdown__1 fourthdown;

}
