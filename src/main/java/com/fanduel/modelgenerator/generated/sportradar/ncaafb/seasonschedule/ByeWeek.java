package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class ByeWeek {
    @JsonProperty("team")
    private Team team;

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }
}
