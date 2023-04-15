
package com.fanduel.modelgenerator.sportradar.mlb.seriessummary;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "start_date",
    "id",
    "round",
    "best_of",
    "status",
    "season",
    "teams",
    "_comment"
})
@Generated("jsonschema2pojo")
public class SeriesSummaryResponse {

    @JsonProperty("title")
    public String title;
    @JsonProperty("start_date")
    public String startDate;
    @JsonProperty("id")
    public String id;
    @JsonProperty("round")
    public String round;
    @JsonProperty("best_of")
    public Integer bestOf;
    @JsonProperty("status")
    public String status;
    @JsonProperty("season")
    public Season season;
    @JsonProperty("teams")
    public List<Team> teams = new ArrayList<Team>();
    @JsonProperty("_comment")
    public String comment;

}
