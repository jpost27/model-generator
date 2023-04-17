package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
