package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Away {
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
}
