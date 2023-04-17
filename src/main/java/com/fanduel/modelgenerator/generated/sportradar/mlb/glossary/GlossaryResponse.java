package com.fanduel.modelgenerator.generated.sportradar.mlb.glossary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class GlossaryResponse {
    @JsonProperty("runner_outcomes")
    private List<RunnerOutcome> runnerOutcomes;

    @JsonProperty("pitch_outcomes")
    private List<PitchOutcome> pitchOutcomes;

    @JsonProperty("player_positions")
    private List<PlayerPosition> playerPositions;

    @JsonProperty("transaction_types")
    private List<Object> transactionTypes;

    @JsonProperty("game_statuses")
    private List<GameStatus> gameStatuses;

    @JsonProperty("post_season_games")
    private List<PostSeasonGame> postSeasonGames;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("pitch_types")
    private List<PitchType> pitchTypes;

    @JsonProperty("player_statuses")
    private List<PlayerStatus> playerStatuses;
}
