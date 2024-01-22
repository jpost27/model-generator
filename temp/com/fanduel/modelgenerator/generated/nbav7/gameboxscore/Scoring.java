package com.fanduel.modelgenerator.generated.nbav7.gameboxscore;

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
public class Scoring {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("type")
    private String type;

    @JsonProperty("points")
    private Integer points;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
