
package com.fanduel.modelgenerator.sportradar.ncaaf.playbyplay;

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
    "inside_20",
    "endzone",
    "touchback",
    "player",
    "team",
    "touchdown",
    "firstdown",
    "safety",
    "fumble",
    "tackle",
    "ast_tackle",
    "sack",
    "ast_sack",
    "sack_yards",
    "tlost",
    "ast_tlost",
    "forced_fumble",
    "category",
    "complete",
    "interception",
    "target",
    "reception",
    "yards_after_catch",
    "penalty",
    "out_of_bounds",
    "lost",
    "down",
    "att_yards",
    "missed",
    "blocked",
    "returned",
    "made",
    "return",
    "faircatch",
    "int_yards",
    "int_touchdown"
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
    @JsonProperty("inside_20")
    public Integer inside20;
    @JsonProperty("endzone")
    public Integer endzone;
    @JsonProperty("touchback")
    public Integer touchback;
    @JsonProperty("player")
    public Player player;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("touchdown")
    public Integer touchdown;
    @JsonProperty("firstdown")
    public Integer firstdown;
    @JsonProperty("safety")
    public Integer safety;
    @JsonProperty("fumble")
    public Integer fumble;
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
    @JsonProperty("category")
    public String category;
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
    @JsonProperty("penalty")
    public Integer penalty;
    @JsonProperty("out_of_bounds")
    public Integer outOfBounds;
    @JsonProperty("lost")
    public Integer lost;
    @JsonProperty("down")
    public Integer down;
    @JsonProperty("att_yards")
    public Integer attYards;
    @JsonProperty("missed")
    public Integer missed;
    @JsonProperty("blocked")
    public Integer blocked;
    @JsonProperty("returned")
    public Integer returned;
    @JsonProperty("made")
    public Integer made;
    @JsonProperty("return")
    public Integer _return;
    @JsonProperty("faircatch")
    public Integer faircatch;
    @JsonProperty("int_yards")
    public Integer intYards;
    @JsonProperty("int_touchdown")
    public Integer intTouchdown;

}
