package com.fanduel.modelgenerator.generated.nflv7.playerprofile;

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
public class Draft {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("round")
    private Integer round;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("team")
    private Team team;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }
}
