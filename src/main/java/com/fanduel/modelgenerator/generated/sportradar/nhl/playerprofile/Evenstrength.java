package com.fanduel.modelgenerator.generated.sportradar.nhl.playerprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Evenstrength {
    @JsonProperty("faceoffs_won")
    private Integer faceoffsWon;

    @JsonProperty("assists")
    private Integer assists;

    @JsonProperty("faceoffs")
    private Integer faceoffs;

    @JsonProperty("faceoff_win_pct")
    private Double faceoffWinPct;

    @JsonProperty("shots")
    private Integer shots;

    @JsonProperty("faceoffs_lost")
    private Integer faceoffsLost;

    @JsonProperty("goals")
    private Integer goals;

    @JsonProperty("missed_shots")
    private Integer missedShots;
}
