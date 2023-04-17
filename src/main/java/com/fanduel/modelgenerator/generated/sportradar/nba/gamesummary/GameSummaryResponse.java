package com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GameSummaryResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("times_tied")
    private Integer timesTied;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("clock_decimal")
    private String clockDecimal;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("track_on_court")
    private Boolean trackOnCourt;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("officials")
    private List<Official> officials;

    @JsonProperty("id")
    private String id;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("time_zones")
    private TimeZones timeZones;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("quarter")
    private Integer quarter;

    @JsonProperty("entry_mode")
    private String entryMode;
}
