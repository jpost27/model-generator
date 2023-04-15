
package com.fanduel.modelgenerator.sportradar.mlb.glossary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pitch_types",
    "player_statuses",
    "pitch_outcomes",
    "game_statuses",
    "runner_outcomes",
    "post_season_games",
    "player_positions",
    "transaction_types",
    "_comment"
})
@Generated("jsonschema2pojo")
public class GlossaryResponse {

    @JsonProperty("pitch_types")
    public List<PitchType> pitchTypes = new ArrayList<PitchType>();
    @JsonProperty("player_statuses")
    public List<PlayerStatus> playerStatuses = new ArrayList<PlayerStatus>();
    @JsonProperty("pitch_outcomes")
    public List<PitchOutcome> pitchOutcomes = new ArrayList<PitchOutcome>();
    @JsonProperty("game_statuses")
    public List<GameStatus> gameStatuses = new ArrayList<GameStatus>();
    @JsonProperty("runner_outcomes")
    public List<RunnerOutcome> runnerOutcomes = new ArrayList<RunnerOutcome>();
    @JsonProperty("post_season_games")
    public List<PostSeasonGame> postSeasonGames = new ArrayList<PostSeasonGame>();
    @JsonProperty("player_positions")
    public List<PlayerPosition> playerPositions = new ArrayList<PlayerPosition>();
    @JsonProperty("transaction_types")
    public List<Object> transactionTypes = new ArrayList<Object>();
    @JsonProperty("_comment")
    public String comment;

}
