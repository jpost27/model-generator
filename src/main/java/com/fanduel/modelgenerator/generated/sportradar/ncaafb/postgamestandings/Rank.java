package com.fanduel.modelgenerator.generated.sportradar.ncaafb.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Rank {
    @JsonProperty("division")
    private Integer division;

    @JsonProperty("conference")
    private Integer conference;

    public Optional<Integer> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<Integer> getConference() {
        return Optional.ofNullable(conference);
    }
}
