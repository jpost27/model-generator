package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentschedule;

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
public class TournamentScheduleResponse {
    @JsonProperty("tournaments")
    private List<Tournament> tournaments;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("tour")
    private Tour tour;

    public List<Tournament> getTournaments() {
        return Optional.ofNullable(tournaments).orElse(Collections.emptyList());
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<Tour> getTour() {
        return Optional.ofNullable(tour);
    }
}
