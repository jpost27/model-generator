package com.fanduel.modelgenerator.generated.nflv7.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Player {
    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("punts")
    private Punts punts;

    @JsonProperty("field_goals")
    private FieldGoals fieldGoals;

    @JsonProperty("extra_points")
    private ExtraPoints extraPoints;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("games_started")
    private Integer gamesStarted;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("misc_returns")
    private MiscReturns miscReturns;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("int_returns")
    private IntReturns intReturns;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("kickoffs")
    private Kickoffs kickoffs;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("passing")
    private Passing passing;

    public Optional<KickReturns> getKickReturns() {
        return Optional.ofNullable(kickReturns);
    }

    public Optional<Conversions> getConversions() {
        return Optional.ofNullable(conversions);
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

    public Optional<FieldGoals> getFieldGoals() {
        return Optional.ofNullable(fieldGoals);
    }

    public Optional<ExtraPoints> getExtraPoints() {
        return Optional.ofNullable(extraPoints);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<Integer> getGamesStarted() {
        return Optional.ofNullable(gamesStarted);
    }

    public Optional<Receiving> getReceiving() {
        return Optional.ofNullable(receiving);
    }

    public Optional<MiscReturns> getMiscReturns() {
        return Optional.ofNullable(miscReturns);
    }

    public Optional<Integer> getGamesPlayed() {
        return Optional.ofNullable(gamesPlayed);
    }

    public Optional<Defense> getDefense() {
        return Optional.ofNullable(defense);
    }

    public Optional<IntReturns> getIntReturns() {
        return Optional.ofNullable(intReturns);
    }

    public Optional<String> getJersey() {
        return Optional.ofNullable(jersey);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
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

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Passing> getPassing() {
        return Optional.ofNullable(passing);
    }
}
