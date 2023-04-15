
package com.fanduel.modelgenerator.sportradar.mlb.leagueschedule;

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
    "games",
    "_comment"
})
@Generated("jsonschema2pojo")
public class LeagueScheduleResponse {

    @JsonProperty("league")
    public League league;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("games")
    public List<Game> games = new ArrayList<Game>();
    @JsonProperty("_comment")
    public String comment;

}
