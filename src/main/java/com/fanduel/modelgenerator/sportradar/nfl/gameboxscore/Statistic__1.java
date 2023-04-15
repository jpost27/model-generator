
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

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
    "att_yards",
    "firstdown",
    "touchdown",
    "inside_20",
    "goaltogo",
    "blitz",
    "hurry",
    "knockdown",
    "pocket_time",
    "on_target_throw",
    "batted_pass",
    "player",
    "team",
    "target",
    "reception",
    "yards_after_catch",
    "broken_tackles",
    "dropped",
    "catchable",
    "yards_after_contact",
    "missed_tackles",
    "def_target",
    "def_comp",
    "category",
    "made",
    "missed",
    "kneel_down",
    "scramble",
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
    @JsonProperty("att_yards")
    public Integer attYards;
    @JsonProperty("firstdown")
    public Integer firstdown;
    @JsonProperty("touchdown")
    public Integer touchdown;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("goaltogo")
    public Integer goaltogo;
    @JsonProperty("blitz")
    public Integer blitz;
    @JsonProperty("hurry")
    public Integer hurry;
    @JsonProperty("knockdown")
    public Integer knockdown;
    @JsonProperty("pocket_time")
    public Double pocketTime;
    @JsonProperty("on_target_throw")
    public Integer onTargetThrow;
    @JsonProperty("batted_pass")
    public Integer battedPass;
    @JsonProperty("player")
    public Player__2 player;
    @JsonProperty("team")
    public Team__4 team;
    @JsonProperty("target")
    public Integer target;
    @JsonProperty("reception")
    public Integer reception;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("broken_tackles")
    public Integer brokenTackles;
    @JsonProperty("dropped")
    public Integer dropped;
    @JsonProperty("catchable")
    public Integer catchable;
    @JsonProperty("yards_after_contact")
    public Integer yardsAfterContact;
    @JsonProperty("missed_tackles")
    public Integer missedTackles;
    @JsonProperty("def_target")
    public Integer defTarget;
    @JsonProperty("def_comp")
    public Integer defComp;
    @JsonProperty("category")
    public String category;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("kneel_down")
    public Integer kneelDown;
    @JsonProperty("scramble")
    public Integer scramble;
    @JsonProperty("down")
    public Integer down;

}
