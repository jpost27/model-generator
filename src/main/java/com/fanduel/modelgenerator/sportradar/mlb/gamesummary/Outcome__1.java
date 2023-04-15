
package com.fanduel.modelgenerator.sportradar.mlb.gamesummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "klook",
    "kswing",
    "ktotal",
    "ball",
    "iball",
    "dirtball",
    "foul"
})
@Generated("jsonschema2pojo")
public class Outcome__1 {

    @JsonProperty("klook")
    public Integer klook;
    @JsonProperty("kswing")
    public Integer kswing;
    @JsonProperty("ktotal")
    public Integer ktotal;
    @JsonProperty("ball")
    public Integer ball;
    @JsonProperty("iball")
    public Integer iball;
    @JsonProperty("dirtball")
    public Integer dirtball;
    @JsonProperty("foul")
    public Integer foul;

}
