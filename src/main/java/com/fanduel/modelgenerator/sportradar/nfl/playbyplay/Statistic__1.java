
package com.fanduel.modelgenerator.sportradar.nfl.playbyplay;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stat_type",
    "penalty",
    "yards",
    "player",
    "team"
})
@Generated("jsonschema2pojo")
public class Statistic__1 {

    @JsonProperty("stat_type")
    public String statType;
    @JsonProperty("penalty")
    public Integer penalty;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("player")
    public Player__2 player;
    @JsonProperty("team")
    public Team__3 team;

}
