
package com.fanduel.modelgenerator.sportradar.nfl.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stat_type",
    "attempt",
    "yards",
    "net_yards",
    "touchback",
    "onside_attempt",
    "onside_success",
    "squib_kick",
    "player",
    "team",
    "category",
    "complete",
    "att_yards",
    "firstdown",
    "inside_20",
    "goaltogo",
    "blitz",
    "hurry",
    "knockdown",
    "pocket_time",
    "on_target_throw",
    "batted_pass",
    "target",
    "reception",
    "yards_after_catch",
    "dropped",
    "catchable",
    "missed_tackles",
    "def_target",
    "def_comp",
    "tackle",
    "broken_tackles",
    "kneel_down",
    "scramble",
    "yards_after_contact",
    "ast_tackle",
    "down",
    "incompletion_type",
    "touchdown",
    "made",
    "penalty",
    "qb_hit",
    "missed",
    "endzone",
    "return",
    "nullified",
    "sack",
    "sack_yards",
    "ast_sack",
    "tlost",
    "tlost_yards",
    "ast_tlost",
    "fumble",
    "forced",
    "own_rec",
    "own_rec_yards",
    "play_category",
    "forced_fumble"
})
@Generated("jsonschema2pojo")
public class Statistic {

    @JsonProperty("stat_type")
    public String statType;
    @JsonProperty("attempt")
    public Integer attempt;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("net_yards")
    public Integer netYards;
    @JsonProperty("touchback")
    public Integer touchback;
    @JsonProperty("onside_attempt")
    public Integer onsideAttempt;
    @JsonProperty("onside_success")
    public Integer onsideSuccess;
    @JsonProperty("squib_kick")
    public Integer squibKick;
    @JsonProperty("player")
    public Player player;
    @JsonProperty("team")
    public Team__1 team;
    @JsonProperty("category")
    public String category;
    @JsonProperty("complete")
    public Integer complete;
    @JsonProperty("att_yards")
    public Integer attYards;
    @JsonProperty("firstdown")
    public Integer firstdown;
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
    @JsonProperty("target")
    public Integer target;
    @JsonProperty("reception")
    public Integer reception;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("dropped")
    public Integer dropped;
    @JsonProperty("catchable")
    public Integer catchable;
    @JsonProperty("missed_tackles")
    public Integer missedTackles;
    @JsonProperty("def_target")
    public Integer defTarget;
    @JsonProperty("def_comp")
    public Integer defComp;
    @JsonProperty("tackle")
    public Integer tackle;
    @JsonProperty("broken_tackles")
    public Integer brokenTackles;
    @JsonProperty("kneel_down")
    public Integer kneelDown;
    @JsonProperty("scramble")
    public Integer scramble;
    @JsonProperty("yards_after_contact")
    public Integer yardsAfterContact;
    @JsonProperty("ast_tackle")
    public Integer astTackle;
    @JsonProperty("down")
    public Integer down;
    @JsonProperty("incompletion_type")
    public String incompletionType;
    @JsonProperty("touchdown")
    public Integer touchdown;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("penalty")
    public Integer penalty;
    @JsonProperty("qb_hit")
    public Integer qbHit;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("endzone")
    public Integer endzone;
    @JsonProperty("return")
    public Integer _return;
    @JsonProperty("nullified")
    public Boolean nullified;
    @JsonProperty("sack")
    public Integer sack;
    @JsonProperty("sack_yards")
    public Double sackYards;
    @JsonProperty("ast_sack")
    public Integer astSack;
    @JsonProperty("tlost")
    public Integer tlost;
    @JsonProperty("tlost_yards")
    public Integer tlostYards;
    @JsonProperty("ast_tlost")
    public Integer astTlost;
    @JsonProperty("fumble")
    public Integer fumble;
    @JsonProperty("forced")
    public Integer forced;
    @JsonProperty("own_rec")
    public Integer ownRec;
    @JsonProperty("own_rec_yards")
    public Integer ownRecYards;
    @JsonProperty("play_category")
    public String playCategory;
    @JsonProperty("forced_fumble")
    public Integer forcedFumble;

}
