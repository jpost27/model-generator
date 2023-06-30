package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

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
public class Team {
    @JsonProperty("triples")
    private Integer triples;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("games_saved")
    private Integer gamesSaved;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("whip")
    private String whip;

    @JsonProperty("games_won")
    private Integer gamesWon;

    @JsonProperty("market")
    private String market;

    @JsonProperty("games_lost")
    private Integer gamesLost;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("doubles")
    private Integer doubles;

    @JsonProperty("era")
    private String era;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("strikeouts")
    private Integer strikeouts;

    @JsonProperty("games_completed")
    private Integer gamesCompleted;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    @JsonProperty("runs")
    private Integer runs;

    public Optional<Integer> getTriples() {
        return Optional.ofNullable(triples);
    }

    public Optional<Integer> getH() {
        return Optional.ofNullable(h);
    }

    public Optional<Integer> getGamesSaved() {
        return Optional.ofNullable(gamesSaved);
    }

    public Optional<Integer> getHr() {
        return Optional.ofNullable(hr);
    }

    public Optional<Integer> getSb() {
        return Optional.ofNullable(sb);
    }

    public Optional<String> getWhip() {
        return Optional.ofNullable(whip);
    }

    public Optional<Integer> getGamesWon() {
        return Optional.ofNullable(gamesWon);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Integer> getGamesLost() {
        return Optional.ofNullable(gamesLost);
    }

    public Optional<String> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<Integer> getDoubles() {
        return Optional.ofNullable(doubles);
    }

    public Optional<String> getEra() {
        return Optional.ofNullable(era);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getRbi() {
        return Optional.ofNullable(rbi);
    }

    public Optional<Integer> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<Integer> getStrikeouts() {
        return Optional.ofNullable(strikeouts);
    }

    public Optional<Integer> getGamesCompleted() {
        return Optional.ofNullable(gamesCompleted);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }

    public Optional<Integer> getRuns() {
        return Optional.ofNullable(runs);
    }
}
