package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Event {
    @JsonProperty("on_court")
    private OnCourt onCourt;

    @JsonProperty("turnover_type")
    private String turnoverType;

    @JsonProperty("clock_decimal")
    private String clockDecimal;

    @JsonProperty("possession")
    private Possession possession;

    @JsonProperty("description")
    private String description;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("qualifiers")
    private List<Qualifier> qualifiers;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("attempt")
    private String attempt;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("sequence")
    private Long sequence;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("attribution")
    private Attribution attribution;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("id")
    private String id;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("statistics")
    private List<Statistic> statistics;
}
