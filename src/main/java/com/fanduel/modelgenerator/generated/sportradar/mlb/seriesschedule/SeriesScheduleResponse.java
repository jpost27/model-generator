package com.fanduel.modelgenerator.generated.sportradar.mlb.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeriesScheduleResponse {
    @JsonProperty("series")
    private List<Object> series;

    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;
}
