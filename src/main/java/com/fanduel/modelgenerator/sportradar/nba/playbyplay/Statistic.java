
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "made",
    "shot_type",
    "shot_distance",
    "team",
    "player",
    "rebound_type",
    "shot_type_desc",
    "points",
    "three_point_shot",
    "free_throw_type"
})
@Generated("jsonschema2pojo")
public class Statistic {

    @JsonProperty("type")
    public String type;
    @JsonProperty("made")
    public Boolean made;
    @JsonProperty("shot_type")
    public String shotType;
    @JsonProperty("shot_distance")
    public Double shotDistance;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("player")
    public Player__2 player;
    @JsonProperty("rebound_type")
    public String reboundType;
    @JsonProperty("shot_type_desc")
    public String shotTypeDesc;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("three_point_shot")
    public Boolean threePointShot;
    @JsonProperty("free_throw_type")
    public String freeThrowType;

}
