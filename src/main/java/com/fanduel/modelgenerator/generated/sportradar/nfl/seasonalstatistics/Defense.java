package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Defense {
    @JsonProperty("hurries")
    private Integer hurries;

    @JsonProperty("tloss")
    private Double tloss;

    @JsonProperty("def_comps")
    private Integer defComps;

    @JsonProperty("misc_forced_fumbles")
    private Integer miscForcedFumbles;

    @JsonProperty("missed_tackles")
    private Integer missedTackles;

    @JsonProperty("safeties")
    private Integer safeties;

    @JsonProperty("fumble_recoveries")
    private Integer fumbleRecoveries;

    @JsonProperty("def_targets")
    private Integer defTargets;

    @JsonProperty("passes_defended")
    private Integer passesDefended;

    @JsonProperty("misc_tackles")
    private Integer miscTackles;

    @JsonProperty("misc_assists")
    private Integer miscAssists;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("tackles")
    private Integer tackles;

    @JsonProperty("sack_yards")
    private Double sackYards;

    @JsonProperty("tloss_yards")
    private Double tlossYards;

    @JsonProperty("forced_fumbles")
    private Integer forcedFumbles;

    @JsonProperty("sp_blocks")
    private Integer spBlocks;

    @JsonProperty("fourth_down_stops")
    private Integer fourthDownStops;

    @JsonProperty("qb_hits")
    private Integer qbHits;

    @JsonProperty("three_and_outs_forced")
    private Integer threeAndOutsForced;

    @JsonProperty("knockdowns")
    private Integer knockdowns;

    @JsonProperty("interceptions")
    private Integer interceptions;

    @JsonProperty("sp_tackles")
    private Integer spTackles;

    @JsonProperty("sp_forced_fumbles")
    private Integer spForcedFumbles;

    @JsonProperty("sp_assists")
    private Integer spAssists;

    @JsonProperty("batted_passes")
    private Integer battedPasses;

    @JsonProperty("combined")
    private Integer combined;

    @JsonProperty("sp_fumble_recoveries")
    private Integer spFumbleRecoveries;

    @JsonProperty("misc_fumble_recoveries")
    private Integer miscFumbleRecoveries;

    @JsonProperty("sacks")
    private Double sacks;

    @JsonProperty("blitzes")
    private Integer blitzes;

    public Optional<Integer> getHurries() {
        return Optional.ofNullable(hurries);
    }

    public Optional<Double> getTloss() {
        return Optional.ofNullable(tloss);
    }

    public Optional<Integer> getDefComps() {
        return Optional.ofNullable(defComps);
    }

    public Optional<Integer> getMiscForcedFumbles() {
        return Optional.ofNullable(miscForcedFumbles);
    }

    public Optional<Integer> getMissedTackles() {
        return Optional.ofNullable(missedTackles);
    }

    public Optional<Integer> getSafeties() {
        return Optional.ofNullable(safeties);
    }

    public Optional<Integer> getFumbleRecoveries() {
        return Optional.ofNullable(fumbleRecoveries);
    }

    public Optional<Integer> getDefTargets() {
        return Optional.ofNullable(defTargets);
    }

    public Optional<Integer> getPassesDefended() {
        return Optional.ofNullable(passesDefended);
    }

    public Optional<Integer> getMiscTackles() {
        return Optional.ofNullable(miscTackles);
    }

    public Optional<Integer> getMiscAssists() {
        return Optional.ofNullable(miscAssists);
    }

    public Optional<Integer> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<Integer> getTackles() {
        return Optional.ofNullable(tackles);
    }

    public Optional<Double> getSackYards() {
        return Optional.ofNullable(sackYards);
    }

    public Optional<Double> getTlossYards() {
        return Optional.ofNullable(tlossYards);
    }

    public Optional<Integer> getForcedFumbles() {
        return Optional.ofNullable(forcedFumbles);
    }

    public Optional<Integer> getSpBlocks() {
        return Optional.ofNullable(spBlocks);
    }

    public Optional<Integer> getFourthDownStops() {
        return Optional.ofNullable(fourthDownStops);
    }

    public Optional<Integer> getQbHits() {
        return Optional.ofNullable(qbHits);
    }

    public Optional<Integer> getThreeAndOutsForced() {
        return Optional.ofNullable(threeAndOutsForced);
    }

    public Optional<Integer> getKnockdowns() {
        return Optional.ofNullable(knockdowns);
    }

    public Optional<Integer> getInterceptions() {
        return Optional.ofNullable(interceptions);
    }

    public Optional<Integer> getSpTackles() {
        return Optional.ofNullable(spTackles);
    }

    public Optional<Integer> getSpForcedFumbles() {
        return Optional.ofNullable(spForcedFumbles);
    }

    public Optional<Integer> getSpAssists() {
        return Optional.ofNullable(spAssists);
    }

    public Optional<Integer> getBattedPasses() {
        return Optional.ofNullable(battedPasses);
    }

    public Optional<Integer> getCombined() {
        return Optional.ofNullable(combined);
    }

    public Optional<Integer> getSpFumbleRecoveries() {
        return Optional.ofNullable(spFumbleRecoveries);
    }

    public Optional<Integer> getMiscFumbleRecoveries() {
        return Optional.ofNullable(miscFumbleRecoveries);
    }

    public Optional<Double> getSacks() {
        return Optional.ofNullable(sacks);
    }

    public Optional<Integer> getBlitzes() {
        return Optional.ofNullable(blitzes);
    }
}
