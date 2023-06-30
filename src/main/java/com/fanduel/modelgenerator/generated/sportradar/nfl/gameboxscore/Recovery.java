package com.fanduel.modelgenerator.generated.sportradar.nfl.gameboxscore;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Recovery {
    @JsonProperty("team")
    private Team team;

    @JsonProperty("type")
    private String type;

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
