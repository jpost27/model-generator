package com.fanduel.modelgenerator.generated.sportradar.nhl.gametimeonice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GameTimeOnIceResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("period")
    private Integer period;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("id")
    private String id;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;
}
