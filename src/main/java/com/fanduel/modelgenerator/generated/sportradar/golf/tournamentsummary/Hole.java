package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentsummary;

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
public class Hole {
    @JsonProperty("par")
    private Integer par;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("yardage")
    private Integer yardage;

    public Optional<Integer> getPar() {
        return Optional.ofNullable(par);
    }

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getYardage() {
        return Optional.ofNullable(yardage);
    }
}
