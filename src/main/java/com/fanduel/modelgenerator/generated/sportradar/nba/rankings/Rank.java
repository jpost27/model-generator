package com.fanduel.modelgenerator.generated.sportradar.nba.rankings;

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
public class Rank {
    @JsonProperty("division")
    private Integer division;

    @JsonProperty("conference")
    private Integer conference;

    @JsonProperty("clinched")
    private String clinched;

    public Optional<Integer> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<Integer> getConference() {
        return Optional.ofNullable(conference);
    }

    public Optional<String> getClinched() {
        return Optional.ofNullable(clinched);
    }
}
