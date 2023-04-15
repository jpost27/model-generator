
package com.fanduel.modelgenerator.sportradar.nfl.teamdraftsummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "draft",
    "team",
    "rounds",
    "_comment"
})
@Generated("jsonschema2pojo")
public class TeamDraftSummaryResponse {

    @JsonProperty("draft")
    public Draft draft;
    @JsonProperty("team")
    public Team team;
    @JsonProperty("rounds")
    public List<Round> rounds = new ArrayList<Round>();
    @JsonProperty("_comment")
    public String comment;

}
