package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class DailyScheduleResponse {
    @JsonProperty("date")
    private String date;

    @JsonProperty("league")
    private League league;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("_comment")
    private String comment;
}
