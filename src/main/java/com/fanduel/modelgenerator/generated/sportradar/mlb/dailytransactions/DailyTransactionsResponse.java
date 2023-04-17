package com.fanduel.modelgenerator.generated.sportradar.mlb.dailytransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DailyTransactionsResponse {
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
}
