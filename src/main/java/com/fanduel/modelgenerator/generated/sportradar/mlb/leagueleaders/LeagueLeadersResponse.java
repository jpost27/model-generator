package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LeagueLeadersResponse {
    @JsonProperty("leagues")
    private List<League> leagues;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("_comment")
    private String comment;
}
