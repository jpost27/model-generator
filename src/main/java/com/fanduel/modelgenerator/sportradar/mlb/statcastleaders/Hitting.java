
package com.fanduel.modelgenerator.sportradar.mlb.statcastleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "launch_speed",
    "launch_angle",
    "max_height",
    "travel_time",
    "hang_time",
    "travel_distance",
    "homerun_distance",
    "launch_spin_rate",
    "barreled_ball",
    "distance"
})
@Generated("jsonschema2pojo")
public class Hitting {

    @JsonProperty("launch_speed")
    public LaunchSpeed launchSpeed;
    @JsonProperty("launch_angle")
    public LaunchAngle launchAngle;
    @JsonProperty("max_height")
    public MaxHeight maxHeight;
    @JsonProperty("travel_time")
    public TravelTime travelTime;
    @JsonProperty("hang_time")
    public HangTime hangTime;
    @JsonProperty("travel_distance")
    public TravelDistance travelDistance;
    @JsonProperty("homerun_distance")
    public HomerunDistance homerunDistance;
    @JsonProperty("launch_spin_rate")
    public LaunchSpinRate launchSpinRate;
    @JsonProperty("barreled_ball")
    public BarreledBall barreledBall;
    @JsonProperty("distance")
    public Distance distance;

}
