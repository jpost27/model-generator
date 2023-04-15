
package com.fanduel.modelgenerator.sportradar.ncaaf.rankingscurrentweek;

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
    "week",
    "effective_time",
    "rankings",
    "candidates"
})
@Generated("jsonschema2pojo")
public class RankingsCurrentWeekResponse {

    @JsonProperty("poll")
    public Poll poll;
    @JsonProperty("season")
    public Integer season;
    @JsonProperty("week")
    public Integer week;
    @JsonProperty("effective_time")
    public String effectiveTime;
    @JsonProperty("rankings")
    public List<Ranking> rankings = new ArrayList<Ranking>();
    @JsonProperty("candidates")
    public List<Object> candidates = new ArrayList<Object>();

}
