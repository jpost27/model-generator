package com.fanduel.modelgenerator.generated.sportradar.nhl.teamleadersseasonal;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TeamLeadersSeasonalResponse {
    @JsonProperty("date")
    private String date;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("categories")
    private List<Category> categories;
}
