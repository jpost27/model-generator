
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start",
    "play",
    "finish",
    "complete"
})
@Generated("jsonschema2pojo")
public class Games__17 {

    @JsonProperty("start")
    public Integer start;
    @JsonProperty("play")
    public Integer play;
    @JsonProperty("finish")
    public Integer finish;
    @JsonProperty("complete")
    public Integer complete;

}
