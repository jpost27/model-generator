package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class Position {
    @JsonProperty("a")
    private Integer a;

    @JsonProperty("steal")
    private Steal steal;

    @JsonProperty("fpct")
    private Double fpct;

    @JsonProperty("dp")
    private Integer dp;

    @JsonProperty("error")
    private Integer error;

    @JsonProperty("tc")
    private Integer tc;

    @JsonProperty("pb")
    private Integer pb;

    @JsonProperty("rf")
    private Double rf;

    @JsonProperty("assists")
    private Assists assists;

    @JsonProperty("inn_2")
    private Double inn2;

    @JsonProperty("games")
    private Games games;

    @JsonProperty("inn_1")
    private Integer inn1;

    @JsonProperty("position")
    private String position;

    @JsonProperty("tp")
    private Integer tp;

    @JsonProperty("c_wp")
    private Integer cWp;

    @JsonProperty("errors")
    private Errors errors;

    @JsonProperty("po")
    private Integer po;

    public Optional<Integer> getA() {
        return Optional.ofNullable(a);
    }

    public Optional<Steal> getSteal() {
        return Optional.ofNullable(steal);
    }

    public Optional<Double> getFpct() {
        return Optional.ofNullable(fpct);
    }

    public Optional<Integer> getDp() {
        return Optional.ofNullable(dp);
    }

    public Optional<Integer> getError() {
        return Optional.ofNullable(error);
    }

    public Optional<Integer> getTc() {
        return Optional.ofNullable(tc);
    }

    public Optional<Integer> getPb() {
        return Optional.ofNullable(pb);
    }

    public Optional<Double> getRf() {
        return Optional.ofNullable(rf);
    }

    public Optional<Assists> getAssists() {
        return Optional.ofNullable(assists);
    }

    public Optional<Double> getInn2() {
        return Optional.ofNullable(inn2);
    }

    public Optional<Games> getGames() {
        return Optional.ofNullable(games);
    }

    public Optional<Integer> getInn1() {
        return Optional.ofNullable(inn1);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Integer> getTp() {
        return Optional.ofNullable(tp);
    }

    public Optional<Integer> getCWp() {
        return Optional.ofNullable(cWp);
    }

    public Optional<Errors> getErrors() {
        return Optional.ofNullable(errors);
    }

    public Optional<Integer> getPo() {
        return Optional.ofNullable(po);
    }
}
