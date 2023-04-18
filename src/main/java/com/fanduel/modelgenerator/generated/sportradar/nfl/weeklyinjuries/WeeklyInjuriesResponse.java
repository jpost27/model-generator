package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyinjuries;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class WeeklyInjuriesResponse {
    @JsonProperty("week")
    private Week week;

    @JsonProperty("teams")
    private List<Team> teams;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;
}