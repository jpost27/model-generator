
package com.fanduel.modelgenerator.sportradar.mlb.statcastleaders;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "launch_speed",
    "launch_angle",
    "release_spin_rate",
    "release_extension",
    "release_speed",
    "effective_speed"
})
@Generated("jsonschema2pojo")
public class Pitching {

    @JsonProperty("launch_speed")
    public LaunchSpeed__1 launchSpeed;
    @JsonProperty("launch_angle")
    public LaunchAngle__1 launchAngle;
    @JsonProperty("release_spin_rate")
    public ReleaseSpinRate releaseSpinRate;
    @JsonProperty("release_extension")
    public ReleaseExtension releaseExtension;
    @JsonProperty("release_speed")
    public ReleaseSpeed releaseSpeed;
    @JsonProperty("effective_speed")
    public EffectiveSpeed effectiveSpeed;

}
