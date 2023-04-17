package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Summary {
    @JsonProperty("possession_time")
    private String possessionTime;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("total_yards")
    private Integer totalYards;

    @JsonProperty("week")
    private Week week;

    @JsonProperty("away")
    private Away away;

    @JsonProperty("penalties")
    private Integer penalties;

    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("rush_plays")
    private Integer rushPlays;

    @JsonProperty("fumbles")
    private Integer fumbles;

    @JsonProperty("safeties")
    private Integer safeties;

    @JsonProperty("home")
    private Home home;

    @JsonProperty("play_count")
    private Integer playCount;

    @JsonProperty("lost_fumbles")
    private Integer lostFumbles;

    @JsonProperty("avg_gain")
    private Double avgGain;

    @JsonProperty("turnovers")
    private Integer turnovers;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("penalty_yards")
    private Integer penaltyYards;
}
