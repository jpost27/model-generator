package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

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
public class StartLocation {
    @JsonProperty("yardline")
    private Integer yardline;

    @JsonProperty("alias")
    private String alias;

    public Optional<Integer> getYardline() {
        return Optional.ofNullable(yardline);
    }

    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }
}
