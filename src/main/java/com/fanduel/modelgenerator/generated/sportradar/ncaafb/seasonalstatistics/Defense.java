package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonalstatistics;

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
    @JsonProperty("sack_yards")
    private Double sackYards;

    @JsonProperty("tloss")
    private Double tloss;

    @JsonProperty("tloss_yards")
    private Double tlossYards;

    @JsonProperty("forced_fumbles")
    private Integer forcedFumbles;

    @JsonProperty("sp_blocks")
    private Integer spBlocks;

    @JsonProperty("misc_forced_fumbles")
    private Integer miscForcedFumbles;

    @JsonProperty("safeties")
    private Integer safeties;

    @JsonProperty("fumble_recoveries")
    private Integer fumbleRecoveries;

    @JsonProperty("qb_hits")
    private Integer qbHits;

    @JsonProperty("interceptions")
    private Integer interceptions;

    @JsonProperty("sp_tackles")
    private Integer spTackles;

    @JsonProperty("sp_forced_fumbles")
    private Integer spForcedFumbles;

    @JsonProperty("passes_defended")
    private Integer passesDefended;

    @JsonProperty("misc_tackles")
    private Integer miscTackles;

    @JsonProperty("sp_assists")
    private Integer spAssists;

    @JsonProperty("misc_assists")
    private Integer miscAssists;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("tackles")
    private Integer tackles;

    @JsonProperty("combined")
    private Integer combined;

    @JsonProperty("sp_fumble_recoveries")
    private Integer spFumbleRecoveries;

    @JsonProperty("misc_fumble_recoveries")
    private Integer miscFumbleRecoveries;

    @JsonProperty("sacks")
    private Double sacks;

    public Optional<Double> getSackYards() {
        return Optional.ofNullable(sackYards);
    }

    public Optional<Double> getTloss() {
        return Optional.ofNullable(tloss);
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

    public Optional<Integer> getMiscForcedFumbles() {
        return Optional.ofNullable(miscForcedFumbles);
    }

    public Optional<Integer> getSafeties() {
        return Optional.ofNullable(safeties);
    }

    public Optional<Integer> getFumbleRecoveries() {
        return Optional.ofNullable(fumbleRecoveries);
    }

    public Optional<Integer> getQbHits() {
        return Optional.ofNullable(qbHits);
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

    public Optional<Integer> getPassesDefended() {
        return Optional.ofNullable(passesDefended);
    }

    public Optional<Integer> getMiscTackles() {
        return Optional.ofNullable(miscTackles);
    }

    public Optional<Integer> getSpAssists() {
        return Optional.ofNullable(spAssists);
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
}
