package com.fanduel.modelgenerator.generated.sportradar.golf.playerprofilelive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
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
