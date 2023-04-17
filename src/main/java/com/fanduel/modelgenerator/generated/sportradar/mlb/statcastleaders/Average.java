package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Average {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("distance")
    private Double distance;

    @JsonProperty("release_extension")
    private Double releaseExtension;

    @JsonProperty("launch_speed")
    private Double launchSpeed;

    @JsonProperty("units")
    private String units;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("min")
    private Double min;

    @JsonProperty("max_height")
    private Double maxHeight;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("travel_distance")
    private Double travelDistance;

    @JsonProperty("effective_speed")
    private Double effectiveSpeed;

    @JsonProperty("id")
    private String id;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("hang_time")
    private Double hangTime;

    @JsonProperty("travel_time")
    private Double travelTime;

    @JsonProperty("max")
    private Double max;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("homerun_distance")
    private Double homerunDistance;

    @JsonProperty("launch_spin_rate")
    private Double launchSpinRate;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("barreled_ball")
    private Double barreledBall;

    @JsonProperty("release_speed")
    private Double releaseSpeed;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("position")
    private String position;

    @JsonProperty("release_spin_rate")
    private Double releaseSpinRate;

    @JsonProperty("status")
    private String status;

    @JsonProperty("launch_angle")
    private Double launchAngle;
}
