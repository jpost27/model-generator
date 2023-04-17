package com.fanduel.modelgenerator.generated.sportradar.nfl.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DailyChangeLogResponse {
    @JsonProperty("schedule")
    private List<Schedule> schedule;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("league")
    private League league;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("end_time")
    private String endTime;

    @JsonProperty("results")
    private List<Result> results;
}
