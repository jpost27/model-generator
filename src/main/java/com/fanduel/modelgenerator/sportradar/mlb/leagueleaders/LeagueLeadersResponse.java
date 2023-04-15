
package com.fanduel.modelgenerator.sportradar.mlb.leagueleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "season",
    "leagues",
    "_comment"
})
@Generated("jsonschema2pojo")
public class LeagueLeadersResponse {

    @JsonProperty("season")
    public Season season;
    @JsonProperty("leagues")
    public List<League> leagues = new ArrayList<League>();
    @JsonProperty("_comment")
    public String comment;

}
