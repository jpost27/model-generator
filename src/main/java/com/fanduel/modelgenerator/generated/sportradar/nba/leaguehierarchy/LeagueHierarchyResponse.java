package com.fanduel.modelgenerator.generated.sportradar.nba.leaguehierarchy;

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
public class LeagueHierarchyResponse {
    @JsonProperty("league")
    private League league;

    @JsonProperty("conferences")
    private List<Conference> conferences;

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public List<Conference> getConferences() {
        return Optional.ofNullable(conferences).orElse(Collections.emptyList());
    }
}
