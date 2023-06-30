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

    public Optional<HangTime> getHangTime() {
        return Optional.ofNullable(hangTime);
    }

    public Optional<TravelTime> getTravelTime() {
        return Optional.ofNullable(travelTime);
    }

    public Optional<Distance> getDistance() {
        return Optional.ofNullable(distance);
    }

    public Optional<MaxHeight> getMaxHeight() {
        return Optional.ofNullable(maxHeight);
    }

    public Optional<HomerunDistance> getHomerunDistance() {
        return Optional.ofNullable(homerunDistance);
    }

    public Optional<TravelDistance> getTravelDistance() {
        return Optional.ofNullable(travelDistance);
    }

    public Optional<LaunchSpinRate> getLaunchSpinRate() {
        return Optional.ofNullable(launchSpinRate);
    }

    public Optional<LaunchSpeed> getLaunchSpeed() {
        return Optional.ofNullable(launchSpeed);
    }

    public Optional<BarreledBall> getBarreledBall() {
        return Optional.ofNullable(barreledBall);
    }

    public Optional<LaunchAngle> getLaunchAngle() {
        return Optional.ofNullable(launchAngle);
    }
}
