
package com.fanduel.modelgenerator.sportradar.mlb.leagueleaders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "players",
    "teams"
})
@Generated("jsonschema2pojo")
public class GamesCompleted {

    @JsonProperty("players")
    public List<Player__13> players = new ArrayList<Player__13>();
    @JsonProperty("teams")
    public List<Team__27> teams = new ArrayList<Team__27>();

}
