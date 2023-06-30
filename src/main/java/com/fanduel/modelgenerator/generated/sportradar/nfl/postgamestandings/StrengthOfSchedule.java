package com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
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
public class StrengthOfSchedule {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("sos")
    private Double sos;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Double> getSos() {
        return Optional.ofNullable(sos);
    }
}
