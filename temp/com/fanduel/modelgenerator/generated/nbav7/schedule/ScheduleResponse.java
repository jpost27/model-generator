package com.fanduel.modelgenerator.generated.nbav7.schedule;

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
public class ScheduleResponse {
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
