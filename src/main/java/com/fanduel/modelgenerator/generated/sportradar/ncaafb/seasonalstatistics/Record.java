package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Record {
    @JsonProperty("touchdowns")
    private Touchdowns touchdowns;

    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("efficiency")
    private Efficiency efficiency;

    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("punts")
    private Punts punts;

    @JsonProperty("first_downs")
    private FirstDowns firstDowns;

    @JsonProperty("field_goals")
    private FieldGoals fieldGoals;

    @JsonProperty("interceptions")
    private Interceptions interceptions;

    @JsonProperty("extra_points")
    private ExtraPoints extraPoints;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("int_returns")
    private IntReturns intReturns;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("kickoffs")
    private Kickoffs kickoffs;

    @JsonProperty("passing")
    private Passing passing;

    public Optional<Touchdowns> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<KickReturns> getKickReturns() {
        return Optional.ofNullable(kickReturns);
    }

    public Optional<Efficiency> getEfficiency() {
        return Optional.ofNullable(efficiency);
    }

    public Optional<Penalties> getPenalties() {
        return Optional.ofNullable(penalties);
    }

    public Optional<Fumbles> getFumbles() {
        return Optional.ofNullable(fumbles);
    }

    public Optional<Punts> getPunts() {
        return Optional.ofNullable(punts);
    }

    public Optional<FirstDowns> getFirstDowns() {
        return Optional.ofNullable(firstDowns);
    }

    public Optional<FieldGoals> getFieldGoals() {
        return Optional.ofNullable(fieldGoals);
    }

    public Optional<Interceptions> getInterceptions() {
        return Optional.ofNullable(interceptions);
    }

    public Optional<ExtraPoints> getExtraPoints() {
        return Optional.ofNullable(extraPoints);
    }

    public Optional<Receiving> getReceiving() {
        return Optional.ofNullable(receiving);
    }

    public Optional<Integer> getGamesPlayed() {
        return Optional.ofNullable(gamesPlayed);
    }

    public Optional<IntReturns> getIntReturns() {
        return Optional.ofNullable(intReturns);
    }

    public Optional<Defense> getDefense() {
        return Optional.ofNullable(defense);
    }

    public Optional<Rushing> getRushing() {
        return Optional.ofNullable(rushing);
    }

    public Optional<PuntReturns> getPuntReturns() {
        return Optional.ofNullable(puntReturns);
    }

    public Optional<Kickoffs> getKickoffs() {
        return Optional.ofNullable(kickoffs);
    }

    public Optional<Passing> getPassing() {
        return Optional.ofNullable(passing);
    }
}
