package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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

    @JsonProperty("qb_hits")
    private Integer qbHits;

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
}
