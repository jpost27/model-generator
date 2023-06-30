package com.fanduel.modelgenerator.generated.sportradar.nba.teamdraftsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class TeamDraftSummaryResponse {
    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("rounds")
    private List<Round> rounds;

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public List<Round> getRounds() {
        return Optional.ofNullable(rounds).orElse(Collections.emptyList());
    }
}
