package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("triples")
    private Integer triples;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("whip")
    private String whip;

    @JsonProperty("games_won")
    private Integer gamesWon;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("era")
    private String era;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("strikeouts")
    private Integer strikeouts;

    @JsonProperty("games_completed")
    private Integer gamesCompleted;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("games_saved")
    private Integer gamesSaved;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("games_lost")
    private Integer gamesLost;

    @JsonProperty("doubles")
    private Integer doubles;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("position")
    private String position;

    @JsonProperty("runs")
    private Integer runs;

    @JsonProperty("status")
    private String status;
}
