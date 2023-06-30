package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("net_yards")
    private Integer netYards;

    @JsonProperty("sack")
    private Integer sack;

    @JsonProperty("endzone")
    private Integer endzone;

    @JsonProperty("inside_20")
    private Integer inside20;

    @JsonProperty("attempt")
    private Integer attempt;

    @JsonProperty("tlost")
    private Integer tlost;

    @JsonProperty("down")
    private Integer down;

    @JsonProperty("touchback")
    private Integer touchback;

    @JsonProperty("blocked")
    private Integer blocked;

    @JsonProperty("safety")
    private Integer safety;

    @JsonProperty("touchdown")
    private Integer touchdown;

    @JsonProperty("ast_sack")
    private Integer astSack;

    @JsonProperty("reception")
    private Integer reception;

    @JsonProperty("player")
    private Player player;

    @JsonProperty("sack_yards")
    private Integer sackYards;

    @JsonProperty("stat_type")
    private String statType;

    @JsonProperty("missed")
    private Integer missed;

    @JsonProperty("made")
    private Integer made;

    @JsonProperty("firstdown")
    private Integer firstdown;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("yards")
    private Integer yards;

    @JsonProperty("fumble")
    private Integer fumble;

    @JsonProperty("forced_fumble")
    private Integer forcedFumble;

    @JsonProperty("target")
    private Integer target;

    @JsonProperty("return")
    private Integer _return;

    @JsonProperty("att_yards")
    private Integer attYards;

    @JsonProperty("ast_tackle")
    private Integer astTackle;

    @JsonProperty("ast_tlost")
    private Integer astTlost;

    @JsonProperty("interception")
    private Integer interception;

    @JsonProperty("tackle")
    private Integer tackle;

    @JsonProperty("faircatch")
    private Integer faircatch;

    @JsonProperty("complete")
    private Integer complete;

    @JsonProperty("category")
    private String category;

    @JsonProperty("returned")
    private Integer returned;

    @JsonProperty("yards_after_catch")
    private Integer yardsAfterCatch;

    public Optional<Integer> getNetYards() {
        return Optional.ofNullable(netYards);
    }

    public Optional<Integer> getSack() {
        return Optional.ofNullable(sack);
    }

    public Optional<Integer> getEndzone() {
        return Optional.ofNullable(endzone);
    }

    public Optional<Integer> getInside20() {
        return Optional.ofNullable(inside20);
    }

    public Optional<Integer> getAttempt() {
        return Optional.ofNullable(attempt);
    }

    public Optional<Integer> getTlost() {
        return Optional.ofNullable(tlost);
    }

    public Optional<Integer> getDown() {
        return Optional.ofNullable(down);
    }

    public Optional<Integer> getTouchback() {
        return Optional.ofNullable(touchback);
    }

    public Optional<Integer> getBlocked() {
        return Optional.ofNullable(blocked);
    }

    public Optional<Integer> getSafety() {
        return Optional.ofNullable(safety);
    }

    public Optional<Integer> getTouchdown() {
        return Optional.ofNullable(touchdown);
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

    public Optional<Integer> getSackYards() {
        return Optional.ofNullable(sackYards);
    }

    public Optional<String> getStatType() {
        return Optional.ofNullable(statType);
    }

    public Optional<Integer> getMissed() {
        return Optional.ofNullable(missed);
    }

    public Optional<Integer> getMade() {
        return Optional.ofNullable(made);
    }

    public Optional<Integer> getFirstdown() {
        return Optional.ofNullable(firstdown);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
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

    public Optional<Integer> getTarget() {
        return Optional.ofNullable(target);
    }

    public Optional<Integer> get_return() {
        return Optional.ofNullable(_return);
    }

    public Optional<Integer> getAttYards() {
        return Optional.ofNullable(attYards);
    }

    public Optional<Integer> getAstTackle() {
        return Optional.ofNullable(astTackle);
    }

    public Optional<Integer> getAstTlost() {
        return Optional.ofNullable(astTlost);
    }

    public Optional<Integer> getInterception() {
        return Optional.ofNullable(interception);
    }

    public Optional<Integer> getTackle() {
        return Optional.ofNullable(tackle);
    }

    public Optional<Integer> getFaircatch() {
        return Optional.ofNullable(faircatch);
    }

    public Optional<Integer> getComplete() {
        return Optional.ofNullable(complete);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(category);
    }

    public Optional<Integer> getReturned() {
        return Optional.ofNullable(returned);
    }

    public Optional<Integer> getYardsAfterCatch() {
        return Optional.ofNullable(yardsAfterCatch);
    }
}
