package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
public class Pitching {
    @JsonProperty("release_extension")
    private ReleaseExtension releaseExtension;

    @JsonProperty("launch_speed")
    private LaunchSpeed launchSpeed;

    @JsonProperty("effective_speed")
    private EffectiveSpeed effectiveSpeed;

    @JsonProperty("release_spin_rate")
    private ReleaseSpinRate releaseSpinRate;

    @JsonProperty("launch_angle")
    private LaunchAngle launchAngle;

    @JsonProperty("release_speed")
    private ReleaseSpeed releaseSpeed;
}
