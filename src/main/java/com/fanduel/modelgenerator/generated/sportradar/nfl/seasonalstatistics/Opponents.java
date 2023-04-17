package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Opponents {
    @JsonProperty("touchdowns")
    private Touchdowns touchdowns;

    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("efficiency")
    private Efficiency efficiency;

    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("punts")
    private Punts punts;

    @JsonProperty("first_downs")
    private FirstDowns firstDowns;

    @JsonProperty("field_goals")
    private FieldGoals fieldGoals;

    @JsonProperty("interceptions")
    private Interceptions interceptions;

    @JsonProperty("extra_points")
    private ExtraPoints extraPoints;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("int_returns")
    private IntReturns intReturns;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("kickoffs")
    private Kickoffs kickoffs;

    @JsonProperty("passing")
    private Passing passing;
}
