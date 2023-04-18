package com.fanduel.modelgenerator.generated.sportradar.nhl.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Record {
    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("goals_for")
    private Integer goalsFor;

    @JsonProperty("record_type")
    private String recordType;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;

    @JsonProperty("goals_against")
    private Integer goalsAgainst;

    @JsonProperty("win_pct")
    private Double winPct;

    @JsonProperty("points")
    private Integer points;
}
