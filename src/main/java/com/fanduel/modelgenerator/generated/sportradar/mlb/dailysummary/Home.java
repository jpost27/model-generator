package com.fanduel.modelgenerator.generated.sportradar.mlb.dailysummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Home {
    @JsonProperty("probable_pitcher")
    private ProbablePitcher probablePitcher;

    @JsonProperty("scoring")
    private List<Scoring> scoring;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("lineup")
    private List<Lineup> lineup;

    @JsonProperty("starting_pitcher")
    private StartingPitcher startingPitcher;

    @JsonProperty("market")
    private String market;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("roster")
    private List<Roster> roster;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    @JsonProperty("runs")
    private Integer runs;

    @JsonProperty("win")
    private Integer win;

    @JsonProperty("errors")
    private Integer errors;

    @JsonProperty("statistics")
    private Statistics statistics;

    public Optional<ProbablePitcher> getProbablePitcher() {
        return Optional.ofNullable(probablePitcher);
    }

    public List<Scoring> getScoring() {
        return Optional.ofNullable(scoring).orElse(Collections.emptyList());
    }

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public List<Lineup> getLineup() {
        return Optional.ofNullable(lineup).orElse(Collections.emptyList());
    }

    public Optional<StartingPitcher> getStartingPitcher() {
        return Optional.ofNullable(startingPitcher);
    }

    public Optional<String> getMarket() {
        return Optional.ofNullable(market);
    }

    public Optional<Integer> getHits() {
        return Optional.ofNullable(hits);
    }

    public Optional<Integer> getLoss() {
        return Optional.ofNullable(loss);
    }

    public List<Roster> getRoster() {
        return Optional.ofNullable(roster).orElse(Collections.emptyList());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getAbbr() {
        return Optional.ofNullable(abbr);
    }

    public Optional<Integer> getRuns() {
        return Optional.ofNullable(runs);
    }

    public Optional<Integer> getWin() {
        return Optional.ofNullable(win);
    }

    public Optional<Integer> getErrors() {
        return Optional.ofNullable(errors);
    }

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
