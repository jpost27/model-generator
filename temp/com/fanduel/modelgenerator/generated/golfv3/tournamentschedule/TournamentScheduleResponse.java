package com.fanduel.modelgenerator.generated.golfv3.tournamentschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
