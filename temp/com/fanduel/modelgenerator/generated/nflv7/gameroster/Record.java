package com.fanduel.modelgenerator.generated.nflv7.gameroster;

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
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("losses")
    private Integer losses;

    public Optional<Integer> getWins() {
        return Optional.ofNullable(wins);
    }

    public Optional<Integer> getTies() {
        return Optional.ofNullable(ties);
    }

    public Optional<Integer> getLosses() {
        return Optional.ofNullable(losses);
    }
}
