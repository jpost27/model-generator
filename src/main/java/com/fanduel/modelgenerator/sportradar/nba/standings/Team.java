
package com.fanduel.modelgenerator.sportradar.nba.standings;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "wins",
    "losses",
    "win_pct",
    "points_for",
    "points_against",
    "point_diff",
    "sr_id",
    "reference",
    "games_behind",
    "streak",
    "calc_rank",
    "records"
})
@Generated("jsonschema2pojo")
public class Team {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;
    @JsonProperty("win_pct")
    public Double winPct;
    @JsonProperty("points_for")
    public Double pointsFor;
    @JsonProperty("points_against")
    public Double pointsAgainst;
    @JsonProperty("point_diff")
    public Double pointDiff;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("games_behind")
    public GamesBehind gamesBehind;
    @JsonProperty("streak")
    public Streak streak;
    @JsonProperty("calc_rank")
    public CalcRank calcRank;
    @JsonProperty("records")
    public List<Record> records = new ArrayList<Record>();

}
