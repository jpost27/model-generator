package com.fanduel.modelgenerator.generated.sportradar.nfl.teamdraftsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class TeamDraftSummaryResponse {
    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("rounds")
    private List<Round> rounds;
}
