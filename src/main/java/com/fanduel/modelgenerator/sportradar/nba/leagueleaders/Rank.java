
package com.fanduel.modelgenerator.sportradar.nba.leagueleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rank",
    "tied",
    "score",
    "player",
    "teams",
    "total",
    "average"
})
@Generated("jsonschema2pojo")
public class Rank {

    @JsonProperty("rank")
    public Integer rank;
    @JsonProperty("tied")
    public Boolean tied;
    @JsonProperty("score")
    public Double score;
    @JsonProperty("player")
    public Player player;
    @JsonProperty("teams")
    public List<Team> teams = new ArrayList<Team>();
    @JsonProperty("total")
    public Total total;
    @JsonProperty("average")
    public Average average;

}
