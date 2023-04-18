package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Total {
    @JsonProperty("corsi_pct")
    private Double corsiPct;

    @JsonProperty("fenwick_pct")
    private Double fenwickPct;

    @JsonProperty("fenwick_total")
    private Integer fenwickTotal;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("on_ice_shots_differential")
    private Integer onIceShotsDifferential;

    @JsonProperty("on_ice_shots_pct")
    private Double onIceShotsPct;

    @JsonProperty("pdo")
    private Double pdo;

    @JsonProperty("corsi_total")
    private Integer corsiTotal;
}
