package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Hitting {
    @JsonProperty("hits")
    private Hits hits;

    @JsonProperty("triples")
    private Triples triples;

    @JsonProperty("home_runs")
    private HomeRuns homeRuns;

    @JsonProperty("stolen_bases")
    private StolenBases stolenBases;

    @JsonProperty("doubles")
    private Doubles doubles;

    @JsonProperty("runs_batted_in")
    private RunsBattedIn runsBattedIn;

    @JsonProperty("batting_average")
    private BattingAverage battingAverage;

    @JsonProperty("runs_scored")
    private RunsScored runsScored;
}
