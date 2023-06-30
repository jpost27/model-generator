package com.fanduel.modelgenerator.generated.sportradar.mlb.glossary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class GlossaryResponse {
    @JsonProperty("runner_outcomes")
    private List<RunnerOutcome> runnerOutcomes;

    @JsonProperty("pitch_outcomes")
    private List<PitchOutcome> pitchOutcomes;

    @JsonProperty("player_positions")
    private List<PlayerPosition> playerPositions;

    @JsonProperty("transaction_types")
    private List<TransactionType> transactionTypes;

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

    public List<RunnerOutcome> getRunnerOutcomes() {
        return Optional.ofNullable(runnerOutcomes).orElse(Collections.emptyList());
    }

    public List<PitchOutcome> getPitchOutcomes() {
        return Optional.ofNullable(pitchOutcomes).orElse(Collections.emptyList());
    }

    public List<PlayerPosition> getPlayerPositions() {
        return Optional.ofNullable(playerPositions).orElse(Collections.emptyList());
    }

    public List<TransactionType> getTransactionTypes() {
        return Optional.ofNullable(transactionTypes).orElse(Collections.emptyList());
    }

    public List<GameStatus> getGameStatuses() {
        return Optional.ofNullable(gameStatuses).orElse(Collections.emptyList());
    }

    public List<PostSeasonGame> getPostSeasonGames() {
        return Optional.ofNullable(postSeasonGames).orElse(Collections.emptyList());
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public List<PitchType> getPitchTypes() {
        return Optional.ofNullable(pitchTypes).orElse(Collections.emptyList());
    }

    public List<PlayerStatus> getPlayerStatuses() {
        return Optional.ofNullable(playerStatuses).orElse(Collections.emptyList());
    }
}
