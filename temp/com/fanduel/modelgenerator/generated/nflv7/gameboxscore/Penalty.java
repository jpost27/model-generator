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
public class Penalty {
    @JsonProperty("result")
    private String result;

    @JsonProperty("description")
    private String description;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("yards")
    private Integer yards;

    public Optional<String> getResult() {
        return Optional.ofNullable(result);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<Integer> getYards() {
        return Optional.ofNullable(yards);
    }
}
