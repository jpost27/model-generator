package com.fanduel.modelgenerator.generated.sportradar.mlb.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Home {
    @JsonProperty("market")
    private String market;

    @JsonProperty("hits")
    private Integer hits;

    @JsonProperty("probable_pitcher")
    private ProbablePitcher probablePitcher;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("scoring")
    private List<Scoring> scoring;

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

    @JsonProperty("starting_pitcher")
    private StartingPitcher startingPitcher;
}