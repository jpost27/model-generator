package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Away {
    @JsonProperty("penalties")
    private Penalties penalties;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("receiving")
    private Receiving receiving;

    @JsonProperty("int_returns")
    private IntReturns intReturns;

    @JsonProperty("defense")
    private Defense defense;

    @JsonProperty("record")
    private Record record;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("kick_returns")
    private KickReturns kickReturns;

    @JsonProperty("touchdowns")
    private Touchdowns touchdowns;

    @JsonProperty("used_challenges")
    private Integer usedChallenges;

    @JsonProperty("efficiency")
    private Efficiency efficiency;

    @JsonProperty("fumbles")
    private Fumbles fumbles;

    @JsonProperty("punts")
    private Punts punts;

    @JsonProperty("remaining_challenges")
    private Integer remainingChallenges;

    @JsonProperty("first_downs")
    private FirstDowns firstDowns;

    @JsonProperty("field_goals")
    private FieldGoals fieldGoals;

    @JsonProperty("extra_points")
    private ExtraPoints extraPoints;

    @JsonProperty("interceptions")
    private Interceptions interceptions;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("market")
    private String market;

    @JsonProperty("misc_returns")
    private MiscReturns miscReturns;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rushing")
    private Rushing rushing;

    @JsonProperty("punt_returns")
    private PuntReturns puntReturns;

    @JsonProperty("kickoffs")
    private Kickoffs kickoffs;

    @JsonProperty("used_timeouts")
    private Integer usedTimeouts;

    @JsonProperty("passing")
    private Passing passing;

    @JsonProperty("remaining_timeouts")
    private Integer remainingTimeouts;
}
