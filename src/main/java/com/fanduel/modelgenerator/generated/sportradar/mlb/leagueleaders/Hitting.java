package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<Hits> getHits() {
        return Optional.ofNullable(hits);
    }

    public Optional<Triples> getTriples() {
        return Optional.ofNullable(triples);
    }

    public Optional<HomeRuns> getHomeRuns() {
        return Optional.ofNullable(homeRuns);
    }

    public Optional<StolenBases> getStolenBases() {
        return Optional.ofNullable(stolenBases);
    }

    public Optional<Doubles> getDoubles() {
        return Optional.ofNullable(doubles);
    }

    public Optional<RunsBattedIn> getRunsBattedIn() {
        return Optional.ofNullable(runsBattedIn);
    }

    public Optional<BattingAverage> getBattingAverage() {
        return Optional.ofNullable(battingAverage);
    }

    public Optional<RunsScored> getRunsScored() {
        return Optional.ofNullable(runsScored);
    }
}
