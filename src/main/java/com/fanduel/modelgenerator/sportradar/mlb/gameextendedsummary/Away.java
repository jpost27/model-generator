
package com.fanduel.modelgenerator.sportradar.mlb.gameextendedsummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "market",
    "abbr",
    "id",
    "runs",
    "hits",
    "errors",
    "win",
    "loss",
    "probable_pitcher",
    "starting_pitcher",
    "roster",
    "lineup",
    "scoring",
    "statistics",
    "players"
})
@Generated("jsonschema2pojo")
public class Away {

    @JsonProperty("name")
    public String name;
    @JsonProperty("market")
    public String market;
    @JsonProperty("abbr")
    public String abbr;
    @JsonProperty("id")
    public String id;
    @JsonProperty("runs")
    public Integer runs;
    @JsonProperty("hits")
    public Integer hits;
    @JsonProperty("errors")
    public Integer errors;
    @JsonProperty("win")
    public Integer win;
    @JsonProperty("loss")
    public Integer loss;
    @JsonProperty("probable_pitcher")
    public ProbablePitcher__1 probablePitcher;
    @JsonProperty("starting_pitcher")
    public StartingPitcher__1 startingPitcher;
    @JsonProperty("roster")
    public List<Roster__1> roster = new ArrayList<Roster__1>();
    @JsonProperty("lineup")
    public List<Lineup__1> lineup = new ArrayList<Lineup__1>();
    @JsonProperty("scoring")
    public List<Scoring__1> scoring = new ArrayList<Scoring__1>();
    @JsonProperty("statistics")
    public Statistics__2 statistics;
    @JsonProperty("players")
    public List<Player__1> players = new ArrayList<Player__1>();

}
