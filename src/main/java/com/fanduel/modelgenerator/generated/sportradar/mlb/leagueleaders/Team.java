package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Team {
    @JsonProperty("triples")
    private Integer triples;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("games_saved")
    private Integer gamesSaved;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("whip")
    private String whip;

    @JsonProperty("games_won")
    private Integer gamesWon;

    @JsonProperty("market")
    private String market;

    @JsonProperty("games_lost")
    private Integer gamesLost;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("doubles")
    private Integer doubles;

    @JsonProperty("era")
    private String era;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("strikeouts")
    private Integer strikeouts;

    @JsonProperty("games_completed")
    private Integer gamesCompleted;

    @JsonProperty("id")
    private String id;

    @JsonProperty("abbr")
    private String abbr;

    @JsonProperty("runs")
    private Integer runs;
}
