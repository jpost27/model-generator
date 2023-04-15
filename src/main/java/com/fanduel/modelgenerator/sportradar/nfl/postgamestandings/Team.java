
package com.fanduel.modelgenerator.sportradar.nfl.postgamestandings;

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
    "alias",
    "sr_id",
    "rank",
    "streak",
    "strength_of_schedule",
    "strength_of_victory",
    "wins",
    "losses",
    "ties",
    "win_pct",
    "points_for",
    "points_against",
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
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("rank")
    public Rank rank;
    @JsonProperty("streak")
    public Streak streak;
    @JsonProperty("strength_of_schedule")
    public StrengthOfSchedule strengthOfSchedule;
    @JsonProperty("strength_of_victory")
    public StrengthOfVictory strengthOfVictory;
    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;
    @JsonProperty("ties")
    public Integer ties;
    @JsonProperty("win_pct")
    public Double winPct;
    @JsonProperty("points_for")
    public Integer pointsFor;
    @JsonProperty("points_against")
    public Integer pointsAgainst;
    @JsonProperty("records")
    public List<Record> records = new ArrayList<Record>();

}
