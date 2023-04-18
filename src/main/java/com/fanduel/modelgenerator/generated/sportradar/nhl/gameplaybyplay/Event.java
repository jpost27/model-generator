package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Event {
    @JsonProperty("strength")
    private String strength;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("penalty_type")
    private String penaltyType;

    @JsonProperty("official")
    private Boolean official;

    @JsonProperty("description")
    private String description;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("wall_clock")
    private String wallClock;

    @JsonProperty("zone")
    private String zone;

    @JsonProperty("attribution")
    private Attribution attribution;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("details")
    private Details details;

    @JsonProperty("stoppage_type")
    private String stoppageType;

    @JsonProperty("id")
    private String id;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("statistics")
    private List<Statistic> statistics;
}
