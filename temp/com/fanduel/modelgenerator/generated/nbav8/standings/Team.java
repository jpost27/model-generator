package com.fanduel.modelgenerator.generated.nbav8.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
public class Team {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("points_against")
    private Double pointsAgainst;

    @JsonProperty("games_behind")
    private GamesBehind gamesBehind;

    @JsonProperty("records")
    private List<Record> records;

    @JsonProperty("points_for")
    private Double pointsFor;

    @JsonProperty("streak")
    private Streak streak;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("point_diff")
    private Double pointDiff;

    @JsonProperty("win_pct")
    private Double winPct;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("calc_rank")
    private CalcRank calcRank;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Double> getPointsAgainst() {
        return Optional.ofNullable(pointsAgainst);
    }

    public Optional<GamesBehind> getGamesBehind() {
        return Optional.ofNullable(gamesBehind);
    }

    public List<Record> getRecords() {
        return Optional.ofNullable(records).orElse(Collections.emptyList());
    }

    public Optional<Double> getPointsFor() {
        return Optional.ofNullable(pointsFor);
    }

    public Optional<Streak> getStreak() {
        return Optional.ofNullable(streak);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }

    public Optional<Double> getPointDiff() {
        return Optional.ofNullable(pointDiff);
    }

    public Optional<Double> getWinPct() {
        return Optional.ofNullable(winPct);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<CalcRank> getCalcRank() {
        return Optional.ofNullable(calcRank);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
