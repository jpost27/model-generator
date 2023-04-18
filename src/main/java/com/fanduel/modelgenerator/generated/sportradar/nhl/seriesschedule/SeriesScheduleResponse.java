package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class SeriesScheduleResponse {
    @JsonProperty("series")
    private List<Series> series;

    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;
}
