package com.fanduel.modelgenerator.generated.nflv7.gameboxscore;

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
public class EndLocation {
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
