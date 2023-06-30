package com.fanduel.modelgenerator.generated.sportradar.ncaafb.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Team {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("points_against")
    private Integer pointsAgainst;

    @JsonProperty("strength_of_victory")
    private StrengthOfVictory strengthOfVictory;

    @JsonProperty("records")
    private List<Record> records;

    @JsonProperty("points_for")
    private Integer pointsFor;

    @JsonProperty("streak")
    private Streak streak;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("strength_of_schedule")
    private StrengthOfSchedule strengthOfSchedule;

    @JsonProperty("win_pct")
    private Double winPct;

    @JsonProperty("market")
    private String market;

    @JsonProperty("subdivision")
    private String subdivision;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("name")
    private String name;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("rank")
    private Rank rank;

    @JsonProperty("id")
    private String id;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getPointsAgainst() {
        return Optional.ofNullable(pointsAgainst);
    }

    public Optional<StrengthOfVictory> getStrengthOfVictory() {
        return Optional.ofNullable(strengthOfVictory);
    }

    public List<Record> getRecords() {
        return Optional.ofNullable(records).orElse(Collections.emptyList());
    }

    public Optional<Integer> getPointsFor() {
        return Optional.ofNullable(pointsFor);
    }

    public Optional<Streak> getStreak() {
        return Optional.ofNullable(streak);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }

    public Optional<StrengthOfSchedule> getStrengthOfSchedule() {
        return Optional.ofNullable(strengthOfSchedule);
    }

    public Optional<Double> getWinPct() {
        return Optional.ofNullable(winPct);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getSubdivision() {
        return Optional.ofNullable(subdivision);
    }

    public Optional<Integer> getTies() {
        return Optional.ofNullable(ties);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    public Optional<Rank> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
