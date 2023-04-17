package com.fanduel.modelgenerator.generated.sportradar.nba.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class LeagueLeadersResponse {
    @JsonProperty("name")
    private String name;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("alias")
    private String alias;

    @JsonProperty("id")
    private String id;

    @JsonProperty("categories")
    private List<Category> categories;

    @JsonProperty("type")
    private String type;
}
