
package com.fanduel.modelgenerator.sportradar.ncaaf.rankingscurrentweek;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "market",
    "rank",
    "wins",
    "losses",
    "ties",
    "prev_rank",
    "points",
    "fp_votes"
})
@Generated("jsonschema2pojo")
public class Ranking {

    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("wins")
    public Integer wins;
    @JsonProperty("losses")
    public Integer losses;
    @JsonProperty("ties")
    public Integer ties;
    @JsonProperty("prev_rank")
    public Integer prevRank;
    @JsonProperty("points")
    public Integer points;
    @JsonProperty("fp_votes")
    public Integer fpVotes;

}
