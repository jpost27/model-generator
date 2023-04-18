package com.fanduel.modelgenerator.generated.sportradar.nhl.seriesstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Average {
    @JsonProperty("penalty_minutes")
    private Double penaltyMinutes;

    @JsonProperty("penalties")
    private Double penalties;

    @JsonProperty("takeaways")
    private Double takeaways;

    @JsonProperty("blocked_shots")
    private Double blockedShots;

    @JsonProperty("blocked_att")
    private Double blockedAtt;

    @JsonProperty("points")
    private Double points;

    @JsonProperty("hits")
    private Double hits;

    @JsonProperty("total")
    private String total;

    @JsonProperty("assists")
    private Double assists;

    @JsonProperty("team_penalty_minutes")
    private Double teamPenaltyMinutes;

    @JsonProperty("shifts")
    private Double shifts;

    @JsonProperty("goals_against")
    private Double goalsAgainst;

    @JsonProperty("shots")
    private Double shots;

    @JsonProperty("team_penalties")
    private Double teamPenalties;

    @JsonProperty("shots_against")
    private Double shotsAgainst;

    @JsonProperty("missed_shots")
    private Double missedShots;

    @JsonProperty("giveaways")
    private Double giveaways;

    @JsonProperty("goals")
    private Double goals;
}
