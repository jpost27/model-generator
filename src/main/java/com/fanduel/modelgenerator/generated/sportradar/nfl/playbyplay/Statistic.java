package com.fanduel.modelgenerator.generated.sportradar.nfl.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistic {
    @JsonProperty("own_rec")
    private Integer ownRec;

    @JsonProperty("pocket_time")
    private Double pocketTime;

    @JsonProperty("sack")
    private Integer sack;

    @JsonProperty("forced")
    private Integer forced;

    @JsonProperty("squib_kick")
    private Integer squibKick;

    @JsonProperty("dropped")
    private Integer dropped;

    @JsonProperty("attempt")
    private Integer attempt;

    @JsonProperty("down")
    private Integer down;

    @JsonProperty("tlost")
    private Integer tlost;

    @JsonProperty("scramble")
    private Integer scramble;

    @JsonProperty("touchback")
    private Integer touchback;

    @JsonProperty("pass_defended")
    private Integer passDefended;

    @JsonProperty("sack_yards")
    private Double sackYards;

    @JsonProperty("stat_type")
    private String statType;

    @JsonProperty("qb_hit")
    private Integer qbHit;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("firstdown")
    private Integer firstdown;

    @JsonProperty("goaltogo")
    private Integer goaltogo;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("fumble")
    private Integer fumble;

    @JsonProperty("forced_fumble")
    private Integer forcedFumble;

    @JsonProperty("blitz")
    private Integer blitz;

    @JsonProperty("def_comp")
    private Integer defComp;

    @JsonProperty("ast_tackle")
    private Integer astTackle;

    @JsonProperty("ast_tlost")
    private Integer astTlost;

    @JsonProperty("tackle")
    private Integer tackle;

    @JsonProperty("faircatch")
    private Integer faircatch;

    @JsonProperty("onside_attempt")
    private Integer onsideAttempt;

    @JsonProperty("out_of_bounds")
    private Integer outOfBounds;

    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("own_rec_yards")
    private Integer ownRecYards;

    @JsonProperty("endzone")
    private Integer endzone;

    @JsonProperty("knockdown")
    private Integer knockdown;

    @JsonProperty("yards_after_contact")
    private Integer yardsAfterContact;

    @JsonProperty("inside_20")
    private Integer inside20;

    @JsonProperty("missed_tackles")
    private Integer missedTackles;

    @JsonProperty("penalty")
    private Integer penalty;

    @JsonProperty("def_target")
    private Integer defTarget;

    @JsonProperty("broken_tackles")
    private Integer brokenTackles;

    @JsonProperty("nullified")
    private Boolean nullified;

    @JsonProperty("kneel_down")
    private Integer kneelDown;

    @JsonProperty("touchdown")
    private Integer touchdown;

    @JsonProperty("on_target_throw")
    private Integer onTargetThrow;

    @JsonProperty("ast_sack")
    private Integer astSack;

    @JsonProperty("reception")
    private Integer reception;

    @JsonProperty("player")
    private Player player;

    @JsonProperty("hang_time")
    private Double hangTime;

    @JsonProperty("missed")
    private Integer missed;

    @JsonProperty("catchable")
    private Integer catchable;

    @JsonProperty("batted_pass")
    private Integer battedPass;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("onside_success")
    private Integer onsideSuccess;

    @JsonProperty("target")
    private Integer target;

    @JsonProperty("incompletion_type")
    private String incompletionType;

    @JsonProperty("play_category")
    private String playCategory;

    @JsonProperty("return")
    private Integer _return;

    @JsonProperty("att_yards")
    private Integer attYards;

    @JsonProperty("tlost_yards")
    private Integer tlostYards;

    @JsonProperty("category")
    private String category;

    @JsonProperty("complete")
    private Integer complete;

    @JsonProperty("hurry")
    private Integer hurry;

    @JsonProperty("yards_after_catch")
    private Integer yardsAfterCatch;
}
