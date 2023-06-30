package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class GamesBehind {
    @JsonProperty("division")
    private Double division;

    @JsonProperty("conference")
    private Double conference;

    @JsonProperty("league")
    private Double league;

    public Optional<Double> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<Double> getConference() {
        return Optional.ofNullable(conference);
    }

    public Optional<Double> getLeague() {
        return Optional.ofNullable(league);
    }
}
