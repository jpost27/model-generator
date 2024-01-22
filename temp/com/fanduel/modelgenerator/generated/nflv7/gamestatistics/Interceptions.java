package com.fanduel.modelgenerator.generated.nflv7.gamestatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Interceptions {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("returned")
    private Integer returned;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getReturnYards() {
        return Optional.ofNullable(returnYards);
    }

    public Optional<Integer> getReturned() {
        return Optional.ofNullable(returned);
    }
}
