package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

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
public class StandingsResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("conferences")
    private List<Conference> conferences;

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public List<Conference> getConferences() {
        return Optional.ofNullable(conferences).orElse(Collections.emptyList());
    }
}
