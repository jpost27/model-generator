package com.fanduel.modelgenerator.generated.sportradar.nfl.postgamestandings;

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

    @JsonProperty("points_against")
    private Integer pointsAgainst;

    @JsonProperty("ties")
    private Integer ties;

    @JsonProperty("points_for")
    private Integer pointsFor;

    @JsonProperty("category")
    private String category;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("win_pct")
    private Double winPct;
}
