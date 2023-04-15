
package com.fanduel.modelgenerator.sportradar.nba.leagueleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "season",
    "id",
    "name",
    "alias",
    "type",
    "categories"
})
@Generated("jsonschema2pojo")
public class LeagueLeadersResponse {

    @JsonProperty("season")
    public Season season;
    @JsonProperty("id")
    public String id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("type")
    public String type;
    @JsonProperty("categories")
    public List<Category> categories = new ArrayList<Category>();

}
