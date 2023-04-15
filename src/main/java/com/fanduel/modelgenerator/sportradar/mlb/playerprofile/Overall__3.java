
package com.fanduel.modelgenerator.sportradar.mlb.playerprofile;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "homerun_distance",
    "travel_time",
    "max_height",
    "distance",
    "launch_speed",
    "barreled_ball",
    "travel_distance",
    "hang_time",
    "launch_angle",
    "launch_spin_rate",
    "generated_speed"
})
@Generated("jsonschema2pojo")
public class Overall__3 {

    @JsonProperty("homerun_distance")
    public HomerunDistance homerunDistance;
    @JsonProperty("travel_time")
    public TravelTime travelTime;
    @JsonProperty("max_height")
    public MaxHeight maxHeight;
    @JsonProperty("distance")
    public Distance distance;
    @JsonProperty("launch_speed")
    public LaunchSpeed launchSpeed;
    @JsonProperty("barreled_ball")
    public BarreledBall barreledBall;
    @JsonProperty("travel_distance")
    public TravelDistance travelDistance;
    @JsonProperty("hang_time")
    public HangTime hangTime;
    @JsonProperty("launch_angle")
    public LaunchAngle launchAngle;
    @JsonProperty("launch_spin_rate")
    public LaunchSpinRate launchSpinRate;
    @JsonProperty("generated_speed")
    public GeneratedSpeed generatedSpeed;

}
