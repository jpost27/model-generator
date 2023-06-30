package com.fanduel.modelgenerator.generated.sportradar.mlb.teamdepthchart;

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
public class TeamDepthChartResponse {
    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("team")
    private Team team;

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }
}
