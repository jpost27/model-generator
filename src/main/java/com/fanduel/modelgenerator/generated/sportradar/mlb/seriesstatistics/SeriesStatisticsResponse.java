package com.fanduel.modelgenerator.generated.sportradar.mlb.seriesstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeriesStatisticsResponse {
    @JsonProperty("round")
    private String round;

    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("id")
    private String id;

    @JsonProperty("best_of")
    private Integer bestOf;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("title")
    private String title;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;
}
