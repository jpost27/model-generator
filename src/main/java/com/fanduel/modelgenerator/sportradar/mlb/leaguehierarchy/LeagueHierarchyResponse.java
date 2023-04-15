
package com.fanduel.modelgenerator.sportradar.mlb.leaguehierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "leagues",
    "_comment"
})
@Generated("jsonschema2pojo")
public class LeagueHierarchyResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("leagues")
    public List<League__1> leagues = new ArrayList<League__1>();
    @JsonProperty("_comment")
    public String comment;

}
