
package com.fanduel.modelgenerator.sportradar.nba.rankings;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "league",
    "season",
    "conferences"
})
@Generated("jsonschema2pojo")
public class RankingsResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("conferences")
    public List<Conference> conferences = new ArrayList<Conference>();

}
