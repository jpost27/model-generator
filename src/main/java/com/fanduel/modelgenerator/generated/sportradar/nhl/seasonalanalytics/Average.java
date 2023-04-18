package com.fanduel.modelgenerator.generated.sportradar.nhl.seasonalanalytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Average {
    @JsonProperty("fenwick_against")
    private Double fenwickAgainst;

    @JsonProperty("on_ice_shots_for")
    private Double onIceShotsFor;

    @JsonProperty("average_shot_distance")
    private Double averageShotDistance;

    @JsonProperty("corsi_for")
    private Double corsiFor;

    @JsonProperty("fenwick_for")
    private Double fenwickFor;

    @JsonProperty("on_ice_shots_against")
    private Double onIceShotsAgainst;

    @JsonProperty("shots")
    private Shots shots;

    @JsonProperty("starts")
    private Starts starts;

    @JsonProperty("corsi_against")
    private Double corsiAgainst;
}
