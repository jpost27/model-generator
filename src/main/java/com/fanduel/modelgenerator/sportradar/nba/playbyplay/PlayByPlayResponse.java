
package com.fanduel.modelgenerator.sportradar.nba.playbyplay;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "status",
    "coverage",
    "scheduled",
    "duration",
    "attendance",
    "lead_changes",
    "times_tied",
    "clock",
    "quarter",
    "track_on_court",
    "reference",
    "entry_mode",
    "sr_id",
    "clock_decimal",
    "time_zones",
    "home",
    "away",
    "periods",
    "deleted_events"
})
@Generated("jsonschema2pojo")
public class PlayByPlayResponse {

    @JsonProperty("id")
    public String id;
    @JsonProperty("status")
    public String status;
    @JsonProperty("coverage")
    public String coverage;
    @JsonProperty("scheduled")
    public String scheduled;
    @JsonProperty("duration")
    public String duration;
    @JsonProperty("attendance")
    public Integer attendance;
    @JsonProperty("lead_changes")
    public Integer leadChanges;
    @JsonProperty("times_tied")
    public Integer timesTied;
    @JsonProperty("clock")
    public String clock;
    @JsonProperty("quarter")
    public Integer quarter;
    @JsonProperty("track_on_court")
    public Boolean trackOnCourt;
    @JsonProperty("reference")
    public String reference;
    @JsonProperty("entry_mode")
    public String entryMode;
    @JsonProperty("sr_id")
    public String srId;
    @JsonProperty("clock_decimal")
    public String clockDecimal;
    @JsonProperty("time_zones")
    public TimeZones timeZones;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("away")
    public Away away;
    @JsonProperty("periods")
    public List<Period> periods = new ArrayList<Period>();
    @JsonProperty("deleted_events")
    public List<DeletedEvent> deletedEvents = new ArrayList<DeletedEvent>();

}
