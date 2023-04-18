package com.fanduel.modelgenerator.generated.sportradar.nhl.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Penalty {
    @JsonProperty("saves")
    private Integer saves;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;

    @JsonProperty("saves_pct")
    private Integer savesPct;

    @JsonProperty("shots_against")
    private Integer shotsAgainst;
}