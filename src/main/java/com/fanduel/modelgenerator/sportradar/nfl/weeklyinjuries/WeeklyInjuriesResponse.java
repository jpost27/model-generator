
package com.fanduel.modelgenerator.sportradar.nfl.weeklyinjuries;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "season",
    "week",
    "teams",
    "_comment"
})
@Generated("jsonschema2pojo")
public class WeeklyInjuriesResponse {

    @JsonProperty("season")
    public Season season;
    @JsonProperty("week")
    public Week week;
    @JsonProperty("teams")
    public List<Team> teams = new ArrayList<Team>();
    @JsonProperty("_comment")
    public String comment;

}
