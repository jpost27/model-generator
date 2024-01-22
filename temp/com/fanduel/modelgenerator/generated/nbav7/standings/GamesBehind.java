package com.fanduel.modelgenerator.generated.nbav7.standings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
