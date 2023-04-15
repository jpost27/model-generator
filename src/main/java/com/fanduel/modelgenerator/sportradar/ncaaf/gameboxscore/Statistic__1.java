
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stat_type",
    "attempt",
    "complete",
    "yards",
    "interception",
    "firstdown",
    "touchdown",
    "sack",
    "sack_yards",
    "inside_20",
    "safety",
    "player",
    "team",
    "target",
    "reception",
    "yards_after_catch",
    "fumble",
    "category",
    "missed",
    "blocked",
    "made",
    "att_yards",
    "returned",
    "down"
})
@Generated("jsonschema2pojo")
public class Statistic__1 {

    @JsonProperty("stat_type")
    public String statType;
    @JsonProperty("attempt")
    public Integer attempt;
    @JsonProperty("complete")
    public Integer complete;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("interception")
    public Integer interception;
    @JsonProperty("firstdown")
    public Integer firstdown;
    @JsonProperty("touchdown")
    public Integer touchdown;
    @JsonProperty("sack")
    public Integer sack;
    @JsonProperty("sack_yards")
    public Integer sackYards;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("safety")
    public Integer safety;
    @JsonProperty("player")
    public Player__2 player;
    @JsonProperty("team")
    public Team__3 team;
    @JsonProperty("target")
    public Integer target;
    @JsonProperty("reception")
    public Integer reception;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("fumble")
    public Integer fumble;
    @JsonProperty("category")
    public String category;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("att_yards")
    public Integer attYards;
    @JsonProperty("returned")
    public Integer returned;
    @JsonProperty("down")
    public Integer down;

}
