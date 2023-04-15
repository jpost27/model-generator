
package com.fanduel.modelgenerator.sportradar.ncaaf.rankingsbyweek;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "poll",
    "season",
    "season_type",
    "week",
    "rankings",
    "candidates"
})
@Generated("jsonschema2pojo")
public class RankingsByWeekResponse {

    @JsonProperty("poll")
    public Poll poll;
    @JsonProperty("season")
    public Integer season;
    @JsonProperty("season_type")
    public String seasonType;
    @JsonProperty("week")
    public Integer week;
    @JsonProperty("rankings")
    public List<Ranking> rankings = new ArrayList<Ranking>();
    @JsonProperty("candidates")
    public List<Candidate> candidates = new ArrayList<Candidate>();

}
