package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
