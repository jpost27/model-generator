package com.fanduel.modelgenerator.generated.sportradar.nba.nbaapiv7simulations;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class NbaApiV7SimulationsResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("games")
    private List<Game> games;

    @JsonProperty("season")
    private Season season;

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public List<Game> getGames() {
        return Optional.ofNullable(games).orElse(Collections.emptyList());
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }
}
