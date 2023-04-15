
package com.fanduel.modelgenerator.sportradar.nfl.gamestatistics;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "possession_time",
    "avg_gain",
    "safeties",
    "turnovers",
    "play_count",
    "rush_plays",
    "total_yards",
    "fumbles",
    "lost_fumbles",
    "penalties",
    "penalty_yards",
    "return_yards"
})
@Generated("jsonschema2pojo")
public class Summary__2 {

    @JsonProperty("possession_time")
    public String possessionTime;
    @JsonProperty("avg_gain")
    public Double avgGain;
    @JsonProperty("safeties")
    public Integer safeties;
    @JsonProperty("turnovers")
    public Integer turnovers;
    @JsonProperty("play_count")
    public Integer playCount;
    @JsonProperty("rush_plays")
    public Integer rushPlays;
    @JsonProperty("total_yards")
    public Integer totalYards;
    @JsonProperty("fumbles")
    public Integer fumbles;
    @JsonProperty("lost_fumbles")
    public Integer lostFumbles;
    @JsonProperty("penalties")
    public Integer penalties;
    @JsonProperty("penalty_yards")
    public Integer penaltyYards;
    @JsonProperty("return_yards")
    public Integer returnYards;

}
