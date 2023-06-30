package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    @JsonProperty("onside_attempt")
    private Integer onsideAttempt;

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

    public Optional<Integer> getOwnRec() {
        return Optional.ofNullable(ownRec);
    }

    public Optional<Double> getPocketTime() {
        return Optional.ofNullable(pocketTime);
    }

    public Optional<Integer> getSack() {
        return Optional.ofNullable(sack);
    }

    public Optional<Integer> getForced() {
        return Optional.ofNullable(forced);
    }

    public Optional<Integer> getSquibKick() {
        return Optional.ofNullable(squibKick);
    }

    public Optional<Integer> getDropped() {
        return Optional.ofNullable(dropped);
    }

    public Optional<Integer> getAttempt() {
        return Optional.ofNullable(attempt);
    }

    public Optional<Integer> getDown() {
        return Optional.ofNullable(down);
    }

    public Optional<Integer> getTlost() {
        return Optional.ofNullable(tlost);
    }

    public Optional<Integer> getScramble() {
        return Optional.ofNullable(scramble);
    }

    public Optional<Integer> getTouchback() {
        return Optional.ofNullable(touchback);
    }

    public Optional<Double> getSackYards() {
        return Optional.ofNullable(sackYards);
    }

    public Optional<String> getStatType() {
        return Optional.ofNullable(statType);
    }

    public Optional<Integer> getQbHit() {
        return Optional.ofNullable(qbHit);
    }

    public Optional<Integer> getMade() {
        return Optional.ofNullable(made);
    }

    public Optional<Integer> getFirstdown() {
        return Optional.ofNullable(firstdown);
    }

    public Optional<Integer> getGoaltogo() {
        return Optional.ofNullable(goaltogo);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }

    public Optional<Integer> getFumble() {
        return Optional.ofNullable(fumble);
    }

    public Optional<Integer> getForcedFumble() {
        return Optional.ofNullable(forcedFumble);
    }

    public Optional<Integer> getBlitz() {
        return Optional.ofNullable(blitz);
    }

    public Optional<Integer> getDefComp() {
        return Optional.ofNullable(defComp);
    }

    public Optional<Integer> getAstTackle() {
        return Optional.ofNullable(astTackle);
    }

    public Optional<Integer> getAstTlost() {
        return Optional.ofNullable(astTlost);
    }

    public Optional<Integer> getTackle() {
        return Optional.ofNullable(tackle);
    }

    public Optional<Integer> getOnsideAttempt() {
        return Optional.ofNullable(onsideAttempt);
    }

    public Optional<Integer> getNetYards() {
        return Optional.ofNullable(netYards);
    }

    public Optional<Integer> getOwnRecYards() {
        return Optional.ofNullable(ownRecYards);
    }

    public Optional<Integer> getEndzone() {
        return Optional.ofNullable(endzone);
    }

    public Optional<Integer> getKnockdown() {
        return Optional.ofNullable(knockdown);
    }

    public Optional<Integer> getYardsAfterContact() {
        return Optional.ofNullable(yardsAfterContact);
    }

    public Optional<Integer> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<Integer> getMissedTackles() {
        return Optional.ofNullable(missedTackles);
    }

    public Optional<Integer> getPenalty() {
        return Optional.ofNullable(penalty);
    }

    public Optional<Integer> getDefTarget() {
        return Optional.ofNullable(defTarget);
    }

    public Optional<Integer> getBrokenTackles() {
        return Optional.ofNullable(brokenTackles);
    }

    public Optional<Boolean> getNullified() {
        return Optional.ofNullable(nullified);
    }

    public Optional<Integer> getKneelDown() {
        return Optional.ofNullable(kneelDown);
    }

    public Optional<Integer> getTouchdown() {
        return Optional.ofNullable(touchdown);
    }

    public Optional<Integer> getOnTargetThrow() {
        return Optional.ofNullable(onTargetThrow);
    }

    public Optional<Integer> getAstSack() {
        return Optional.ofNullable(astSack);
    }

    public Optional<Integer> getReception() {
        return Optional.ofNullable(reception);
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(player);
    }

    public Optional<Integer> getMissed() {
        return Optional.ofNullable(missed);
    }

    public Optional<Integer> getCatchable() {
        return Optional.ofNullable(catchable);
    }

    public Optional<Integer> getBattedPass() {
        return Optional.ofNullable(battedPass);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<Integer> getOnsideSuccess() {
        return Optional.ofNullable(onsideSuccess);
    }

    public Optional<Integer> getTarget() {
        return Optional.ofNullable(target);
    }

    public Optional<String> getIncompletionType() {
        return Optional.ofNullable(incompletionType);
    }

    public Optional<String> getPlayCategory() {
        return Optional.ofNullable(playCategory);
    }

    public Optional<Integer> get_return() {
        return Optional.ofNullable(_return);
    }

    public Optional<Integer> getAttYards() {
        return Optional.ofNullable(attYards);
    }

    public Optional<Integer> getTlostYards() {
        return Optional.ofNullable(tlostYards);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<Integer> getComplete() {
        return Optional.ofNullable(complete);
    }

    public Optional<Integer> getHurry() {
        return Optional.ofNullable(hurry);
    }

    public Optional<Integer> getYardsAfterCatch() {
        return Optional.ofNullable(yardsAfterCatch);
    }
}
