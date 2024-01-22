package com.fanduel.modelgenerator.generated.nflv7.postgamestandings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
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
public class StrengthOfVictory {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("sov")
    private Double sov;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Double> getSov() {
        return Optional.ofNullable(sov);
    }
}
