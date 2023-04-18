package com.fanduel.modelgenerator.generated.sportradar.nhl.schedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class ScheduleResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("season")
    private Season season;
}
