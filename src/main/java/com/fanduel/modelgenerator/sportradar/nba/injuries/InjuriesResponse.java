
package com.fanduel.modelgenerator.sportradar.nba.injuries;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "teams"
})
@Generated("jsonschema2pojo")
public class InjuriesResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("teams")
    public List<Team> teams = new ArrayList<Team>();

}
