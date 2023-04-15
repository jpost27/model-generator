
package com.fanduel.modelgenerator.sportradar.mlb.playbyplay;

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
public class Flags {

    @JsonProperty("is_ab_over")
    public Boolean isAbOver;
    @JsonProperty("is_bunt")
    public Boolean isBunt;
    @JsonProperty("is_hit")
    public Boolean isHit;
    @JsonProperty("is_wild_pitch")
    public Boolean isWildPitch;
    @JsonProperty("is_passed_ball")
    public Boolean isPassedBall;
    @JsonProperty("is_double_play")
    public Boolean isDoublePlay;
    @JsonProperty("is_triple_play")
    public Boolean isTriplePlay;

}
