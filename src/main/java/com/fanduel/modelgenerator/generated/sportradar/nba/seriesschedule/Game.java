package com.fanduel.modelgenerator.generated.sportradar.nba.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Game {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("track_on_court")
    private Boolean trackOnCourt;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("broadcasts")
    private List<Broadcast> broadcasts;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("title")
    private String title;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("id")
    private String id;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("neutral_site")
    private Boolean neutralSite;

    @JsonProperty("status")
    private String status;
}
