package com.fanduel.modelgenerator.generated.sportradar.nfl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
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
