
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tackles",
    "assists",
    "combined",
    "sacks",
    "sack_yards",
    "interceptions",
    "passes_defended",
    "forced_fumbles",
    "fumble_recoveries",
    "qb_hits",
    "tloss",
    "tloss_yards",
    "safeties",
    "sp_tackles",
    "sp_assists",
    "sp_forced_fumbles",
    "sp_fumble_recoveries",
    "sp_blocks",
    "misc_tackles",
    "misc_assists",
    "misc_forced_fumbles",
    "misc_fumble_recoveries",
    "def_targets",
    "def_comps",
    "blitzes",
    "hurries",
    "knockdowns",
    "missed_tackles",
    "batted_passes"
})
@Generated("jsonschema2pojo")
public class Totals__12 {

    @JsonProperty("tackles")
    public Integer tackles;
    @JsonProperty("assists")
    public Integer assists;
    @JsonProperty("combined")
    public Integer combined;
    @JsonProperty("sacks")
    public Double sacks;
    @JsonProperty("sack_yards")
    public Double sackYards;
    @JsonProperty("interceptions")
    public Integer interceptions;
    @JsonProperty("passes_defended")
    public Integer passesDefended;
    @JsonProperty("forced_fumbles")
    public Integer forcedFumbles;
    @JsonProperty("fumble_recoveries")
    public Integer fumbleRecoveries;
    @JsonProperty("qb_hits")
    public Integer qbHits;
    @JsonProperty("tloss")
    public Double tloss;
    @JsonProperty("tloss_yards")
    public Double tlossYards;
    @JsonProperty("safeties")
    public Integer safeties;
    @JsonProperty("sp_tackles")
    public Integer spTackles;
    @JsonProperty("sp_assists")
    public Integer spAssists;
    @JsonProperty("sp_forced_fumbles")
    public Integer spForcedFumbles;
    @JsonProperty("sp_fumble_recoveries")
    public Integer spFumbleRecoveries;
    @JsonProperty("sp_blocks")
    public Integer spBlocks;
    @JsonProperty("misc_tackles")
    public Integer miscTackles;
    @JsonProperty("misc_assists")
    public Integer miscAssists;
    @JsonProperty("misc_forced_fumbles")
    public Integer miscForcedFumbles;
    @JsonProperty("misc_fumble_recoveries")
    public Integer miscFumbleRecoveries;
    @JsonProperty("def_targets")
    public Integer defTargets;
    @JsonProperty("def_comps")
    public Integer defComps;
    @JsonProperty("blitzes")
    public Integer blitzes;
    @JsonProperty("hurries")
    public Integer hurries;
    @JsonProperty("knockdowns")
    public Integer knockdowns;
    @JsonProperty("missed_tackles")
    public Integer missedTackles;
    @JsonProperty("batted_passes")
    public Integer battedPasses;

}
