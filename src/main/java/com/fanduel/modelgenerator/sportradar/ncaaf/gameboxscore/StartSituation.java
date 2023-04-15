
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clock",
    "down",
    "yfd",
    "possession",
    "location"
})
@Generated("jsonschema2pojo")
public class StartSituation {

    @JsonProperty("clock")
    public String clock;
    @JsonProperty("down")
    public Integer down;
    @JsonProperty("yfd")
    public Integer yfd;
    @JsonProperty("possession")
    public Possession__1 possession;
    @JsonProperty("location")
    public Location__1 location;

}
