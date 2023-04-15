
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
public class GamesWon {

    @JsonProperty("players")
    public List<Player__10> players = new ArrayList<Player__10>();
    @JsonProperty("teams")
    public List<Team__21> teams = new ArrayList<Team__21>();

}
