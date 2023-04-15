
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_ab_over",
    "is_bunt",
    "is_hit",
    "is_wild_pitch",
    "is_passed_ball",
    "is_double_play",
    "is_triple_play"
})
@Generated("jsonschema2pojo")
public class Flags__1 {

    @JsonProperty("is_ab_over")
    public Integer isAbOver;
    @JsonProperty("is_bunt")
    public Integer isBunt;
    @JsonProperty("is_hit")
    public Integer isHit;
    @JsonProperty("is_wild_pitch")
    public Integer isWildPitch;
    @JsonProperty("is_passed_ball")
    public Integer isPassedBall;
    @JsonProperty("is_double_play")
    public Integer isDoublePlay;
    @JsonProperty("is_triple_play")
    public Integer isTriplePlay;

}
