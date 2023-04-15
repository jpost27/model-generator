
package com.fanduel.modelgenerator.sportradar.nfl.leaguehierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "conferences",
    "_comment"
})
@Generated("jsonschema2pojo")
public class LeagueHierarchyResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("conferences")
    public List<Conference> conferences = new ArrayList<Conference>();
    @JsonProperty("_comment")
    public String comment;

}
