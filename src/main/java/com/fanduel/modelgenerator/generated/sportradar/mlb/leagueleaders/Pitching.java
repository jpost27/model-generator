package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
