
package com.fanduel.modelgenerator.sportradar.mlb.leagueleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "earned_run_average",
    "whip",
    "games_won",
    "strikeouts",
    "games_saved",
    "games_completed"
})
@Generated("jsonschema2pojo")
public class Pitching {

    @JsonProperty("earned_run_average")
    public EarnedRunAverage earnedRunAverage;
    @JsonProperty("whip")
    public Whip whip;
    @JsonProperty("games_won")
    public GamesWon gamesWon;
    @JsonProperty("strikeouts")
    public Strikeouts strikeouts;
    @JsonProperty("games_saved")
    public GamesSaved gamesSaved;
    @JsonProperty("games_completed")
    public GamesCompleted gamesCompleted;

}
