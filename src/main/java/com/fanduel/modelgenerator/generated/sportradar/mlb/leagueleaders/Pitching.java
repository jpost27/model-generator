package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Pitching {
    @JsonProperty("earned_run_average")
    private EarnedRunAverage earnedRunAverage;

    @JsonProperty("strikeouts")
    private Strikeouts strikeouts;

    @JsonProperty("games_saved")
    private GamesSaved gamesSaved;

    @JsonProperty("games_completed")
    private GamesCompleted gamesCompleted;

    @JsonProperty("whip")
    private Whip whip;

    @JsonProperty("games_won")
    private GamesWon gamesWon;

    public Optional<EarnedRunAverage> getEarnedRunAverage() {
        return Optional.ofNullable(earnedRunAverage);
    }

    public Optional<Strikeouts> getStrikeouts() {
        return Optional.ofNullable(strikeouts);
    }

    public Optional<GamesSaved> getGamesSaved() {
        return Optional.ofNullable(gamesSaved);
    }

    public Optional<GamesCompleted> getGamesCompleted() {
        return Optional.ofNullable(gamesCompleted);
    }

    public Optional<Whip> getWhip() {
        return Optional.ofNullable(whip);
    }

    public Optional<GamesWon> getGamesWon() {
        return Optional.ofNullable(gamesWon);
    }
}
