package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<ReleaseExtension> getReleaseExtension() {
        return Optional.ofNullable(releaseExtension);
    }

    public Optional<LaunchSpeed> getLaunchSpeed() {
        return Optional.ofNullable(launchSpeed);
    }

    public Optional<EffectiveSpeed> getEffectiveSpeed() {
        return Optional.ofNullable(effectiveSpeed);
    }

    public Optional<ReleaseSpinRate> getReleaseSpinRate() {
        return Optional.ofNullable(releaseSpinRate);
    }

    public Optional<LaunchAngle> getLaunchAngle() {
        return Optional.ofNullable(launchAngle);
    }

    public Optional<ReleaseSpeed> getReleaseSpeed() {
        return Optional.ofNullable(releaseSpeed);
    }
}
