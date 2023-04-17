package com.fanduel.modelgenerator.generated.sportradar.nba.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Series {
    @JsonProperty("round")
    private Integer round;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;

    @JsonProperty("participants")
    private List<Participant> participants;
}
