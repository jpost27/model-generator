
package com.fanduel.modelgenerator.sportradar.mlb.leagueleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "batting_average",
    "runs_scored",
    "doubles",
    "triples",
    "home_runs",
    "runs_batted_in",
    "hits",
    "stolen_bases"
})
@Generated("jsonschema2pojo")
public class Hitting {

    @JsonProperty("batting_average")
    public BattingAverage battingAverage;
    @JsonProperty("runs_scored")
    public RunsScored runsScored;
    @JsonProperty("doubles")
    public Doubles doubles;
    @JsonProperty("triples")
    public Triples triples;
    @JsonProperty("home_runs")
    public HomeRuns homeRuns;
    @JsonProperty("runs_batted_in")
    public RunsBattedIn runsBattedIn;
    @JsonProperty("hits")
    public Hits hits;
    @JsonProperty("stolen_bases")
    public StolenBases stolenBases;

}
