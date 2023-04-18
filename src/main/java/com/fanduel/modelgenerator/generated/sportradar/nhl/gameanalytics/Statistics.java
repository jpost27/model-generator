package com.fanduel.modelgenerator.generated.sportradar.nhl.gameanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Statistics {
    @JsonProperty("starts_by_zone")
    private StartsByZone startsByZone;

    @JsonProperty("average_shot_distance")
    private Double averageShotDistance;

    @JsonProperty("corsi_pct")
    private Double corsiPct;

    @JsonProperty("fenwick_pct")
    private Double fenwickPct;

    @JsonProperty("fenwick_total")
    private Integer fenwickTotal;

    @JsonProperty("on_ice_shots_differential")
    private Integer onIceShotsDifferential;

    @JsonProperty("on_ice_shots_pct")
    private Double onIceShotsPct;

    @JsonProperty("pdo")
    private Double pdo;

    @JsonProperty("corsi_total")
    private Integer corsiTotal;

    @JsonProperty("shots_by_type")
    private List<ShotsByType> shotsByType;
}
