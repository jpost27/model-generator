package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Hitting {
    @JsonProperty("hang_time")
    private HangTime hangTime;

    @JsonProperty("travel_time")
    private TravelTime travelTime;

    @JsonProperty("distance")
    private Distance distance;

    @JsonProperty("max_height")
    private MaxHeight maxHeight;

    @JsonProperty("homerun_distance")
    private HomerunDistance homerunDistance;

    @JsonProperty("travel_distance")
    private TravelDistance travelDistance;

    @JsonProperty("launch_spin_rate")
    private LaunchSpinRate launchSpinRate;

    @JsonProperty("launch_speed")
    private LaunchSpeed launchSpeed;

    @JsonProperty("barreled_ball")
    private BarreledBall barreledBall;

    @JsonProperty("launch_angle")
    private LaunchAngle launchAngle;
}
