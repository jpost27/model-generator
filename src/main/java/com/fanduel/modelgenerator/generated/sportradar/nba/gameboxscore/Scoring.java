package com.fanduel.modelgenerator.generated.sportradar.nba.gameboxscore;

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
