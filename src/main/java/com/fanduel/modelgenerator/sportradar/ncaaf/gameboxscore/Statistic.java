
package com.fanduel.modelgenerator.sportradar.ncaaf.gameboxscore;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stat_type",
    "attempt",
    "yards",
    "touchdown",
    "firstdown",
    "safety",
    "fumble",
    "inside_20",
    "player",
    "team",
    "tackle",
    "ast_tackle",
    "sack",
    "ast_sack",
    "sack_yards",
    "tlost",
    "ast_tlost",
    "forced_fumble",
    "complete",
    "interception",
    "target",
    "reception",
    "yards_after_catch",
    "down",
    "category",
    "missed",
    "blocked",
    "made",
    "net_yards",
    "endzone",
    "touchback",
    "att_yards",
    "returned",
    "return",
    "faircatch"
})
@Generated("jsonschema2pojo")
public class Statistic {

    @JsonProperty("stat_type")
    public String statType;
    @JsonProperty("attempt")
    public Integer attempt;
    @JsonProperty("yards")
    public Integer yards;
    @JsonProperty("touchdown")
    public Integer touchdown;
    @JsonProperty("firstdown")
    public Integer firstdown;
    @JsonProperty("safety")
    public Integer safety;
    @JsonProperty("fumble")
    public Integer fumble;
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("player")
    public Player player;
    @JsonProperty("team")
    public Team__1 team;
    @JsonProperty("tackle")
    public Integer tackle;
    @JsonProperty("ast_tackle")
    public Integer astTackle;
    @JsonProperty("sack")
    public Integer sack;
    @JsonProperty("ast_sack")
    public Integer astSack;
    @JsonProperty("sack_yards")
    public Double sackYards;
    @JsonProperty("tlost")
    public Integer tlost;
    @JsonProperty("ast_tlost")
    public Integer astTlost;
    @JsonProperty("forced_fumble")
    public Integer forcedFumble;
    @JsonProperty("complete")
    public Integer complete;
    @JsonProperty("interception")
    public Integer interception;
    @JsonProperty("target")
    public Integer target;
    @JsonProperty("reception")
    public Integer reception;
    @JsonProperty("yards_after_catch")
    public Integer yardsAfterCatch;
    @JsonProperty("down")
    public Integer down;
    @JsonProperty("category")
    public String category;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("net_yards")
    public Integer netYards;
    @JsonProperty("endzone")
    public Integer endzone;
    @JsonProperty("touchback")
    public Integer touchback;
    @JsonProperty("att_yards")
    public Integer attYards;
    @JsonProperty("returned")
    public Integer returned;
    @JsonProperty("return")
    public Integer _return;
    @JsonProperty("faircatch")
    public Integer faircatch;

}
