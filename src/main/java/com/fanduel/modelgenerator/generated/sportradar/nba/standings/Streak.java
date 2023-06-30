package com.fanduel.modelgenerator.generated.sportradar.nba.standings;

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
public class Streak {
    @JsonProperty("kind")
    private String kind;

    @JsonProperty("length")
    private Integer length;

    public Optional<String> getKind() {
        return Optional.ofNullable(kind);
    }

    public Optional<Integer> getLength() {
        return Optional.ofNullable(length);
    }
}
