package com.fanduel.modelgenerator.generated.sportradar.nba.playbyplay;

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
public class Scoring {
    @JsonProperty("away")
    private Away away;

    @JsonProperty("lead_changes")
    private Integer leadChanges;

    @JsonProperty("home")
    private Home home;

    public Optional<Away> getAway() {
        return Optional.ofNullable(away);
    }

    public Optional<Integer> getLeadChanges() {
        return Optional.ofNullable(leadChanges);
    }

    public Optional<Home> getHome() {
        return Optional.ofNullable(home);
    }
}
