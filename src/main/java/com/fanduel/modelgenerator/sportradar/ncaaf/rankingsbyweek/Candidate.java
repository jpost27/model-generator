
package com.fanduel.modelgenerator.sportradar.ncaaf.rankingsbyweek;

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
    "ties",
    "votes",
    "prev_rank"
})
@Generated("jsonschema2pojo")
public class Candidate {

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
    @JsonProperty("ties")
    public Integer ties;
    @JsonProperty("votes")
    public Integer votes;
    @JsonProperty("prev_rank")
    public Integer prevRank;

}
