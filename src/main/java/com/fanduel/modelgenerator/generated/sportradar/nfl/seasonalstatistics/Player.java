package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Player {
    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("punts")
    private Punts punts;

    @JsonProperty("field_goals")
    private FieldGoals fieldGoals;

    @JsonProperty("extra_points")
    private ExtraPoints extraPoints;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("games_started")
    private Integer gamesStarted;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("misc_returns")
    private MiscReturns miscReturns;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("int_returns")
    private IntReturns intReturns;

    @JsonProperty("jersey")
    private String jersey;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("kickoffs")
    private Kickoffs kickoffs;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("passing")
    private Passing passing;
}
