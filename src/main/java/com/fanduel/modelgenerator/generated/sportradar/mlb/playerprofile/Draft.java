package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

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
public class Draft {
    @JsonProperty("round")
    private Integer round;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("pick")
    private Integer pick;

    @JsonProperty("team_id")
    private String teamId;

    public Optional<Integer> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<Integer> getPick() {
        return Optional.ofNullable(pick);
    }

    public Optional<String> getTeamId() {
        return Optional.ofNullable(teamId);
    }
}
