package com.fanduel.modelgenerator.generated.sportradar.nhl.leagueleadersseasonal;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LeagueLeadersSeasonalResponse {
    @JsonProperty("date")
    private String date;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("categories")
    private List<Category> categories;
}
