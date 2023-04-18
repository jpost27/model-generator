package com.fanduel.modelgenerator.generated.sportradar.nhl.gameplaybyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GamePlayByPlayResponse {
    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("period")
    private Integer period;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("scheduled")
    private String scheduled;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("total_game_duration")
    private String totalGameDuration;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("id")
    private String id;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("deleted_events")
    private List<Object> deletedEvents;

    @JsonProperty("attendance")
    private Integer attendance;

    @JsonProperty("status")
    private String status;

    @JsonProperty("entry_mode")
    private String entryMode;
}
