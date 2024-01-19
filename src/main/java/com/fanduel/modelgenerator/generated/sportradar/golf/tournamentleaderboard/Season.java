package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentleaderboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
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
public class Season {
    @JsonProperty("year")
    private Integer year;

    @JsonProperty("id")
    private String id;

    @JsonProperty("tour")
    private Tour tour;

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Tour> getTour() {
        return Optional.ofNullable(tour);
    }
}
