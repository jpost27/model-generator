package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gamestatistics;

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
public class Home {
    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("int_returns")
    private IntReturns intReturns;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("touchdowns")
    private Touchdowns touchdowns;

    @JsonProperty("efficiency")
    private Efficiency efficiency;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("remaining_challenges")
    private Integer remainingChallenges;

    @JsonProperty("punts")
    private Punts punts;

    @JsonProperty("first_downs")
    private FirstDowns firstDowns;

    @JsonProperty("field_goals")
    private FieldGoals fieldGoals;

    @JsonProperty("extra_points")
    private ExtraPoints extraPoints;

    @JsonProperty("interceptions")
    private Interceptions interceptions;

    @JsonProperty("market")
    private String market;

    @JsonProperty("misc_returns")
    private MiscReturns miscReturns;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("kickoffs")
    private Kickoffs kickoffs;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;

    @JsonProperty("passing")
    private Passing passing;

    public Optional<Penalties> getPenalties() {
        return Optional.ofNullable(penalties);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Receiving> getReceiving() {
        return Optional.ofNullable(receiving);
    }

    public Optional<IntReturns> getIntReturns() {
        return Optional.ofNullable(intReturns);
    }

    public Optional<Defense> getDefense() {
        return Optional.ofNullable(defense);
    }

    public Optional<Record> getRecord() {
        return Optional.ofNullable(record);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Summary> getSummary() {
        return Optional.ofNullable(summary);
    }

    public Optional<KickReturns> getKickReturns() {
        return Optional.ofNullable(kickReturns);
    }

    public Optional<Touchdowns> getTouchdowns() {
        return Optional.ofNullable(touchdowns);
    }

    public Optional<Efficiency> getEfficiency() {
        return Optional.ofNullable(efficiency);
    }

    public Optional<Fumbles> getFumbles() {
        return Optional.ofNullable(fumbles);
    }

    public Optional<Integer> getRemainingChallenges() {
        return Optional.ofNullable(remainingChallenges);
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

    public Optional<ExtraPoints> getExtraPoints() {
        return Optional.ofNullable(extraPoints);
    }

    public Optional<Interceptions> getInterceptions() {
        return Optional.ofNullable(interceptions);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<MiscReturns> getMiscReturns() {
        return Optional.ofNullable(miscReturns);
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

    public Optional<Integer> getRemainingTimeouts() {
        return Optional.ofNullable(remainingTimeouts);
    }

    public Optional<Passing> getPassing() {
        return Optional.ofNullable(passing);
    }
}
