package com.fanduel.modelgenerator.generated.sportradar.mlb.statcastleaders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
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

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Double> getDistance() {
        return Optional.ofNullable(distance);
    }

    public Optional<Double> getReleaseExtension() {
        return Optional.ofNullable(releaseExtension);
    }

    public Optional<Double> getLaunchSpeed() {
        return Optional.ofNullable(launchSpeed);
    }

    public Optional<String> getUnits() {
        return Optional.ofNullable(units);
    }

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<Double> getMin() {
        return Optional.ofNullable(min);
    }

    public Optional<Double> getMaxHeight() {
        return Optional.ofNullable(maxHeight);
    }

    public Optional<Integer> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<Double> getTravelDistance() {
        return Optional.ofNullable(travelDistance);
    }

    public Optional<Double> getEffectiveSpeed() {
        return Optional.ofNullable(effectiveSpeed);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<Double> getHangTime() {
        return Optional.ofNullable(hangTime);
    }

    public Optional<Double> getTravelTime() {
        return Optional.ofNullable(travelTime);
    }

    public Optional<Double> getMax() {
        return Optional.ofNullable(max);
    }

    public Optional<Integer> getCount() {
        return Optional.ofNullable(count);
    }

    public Optional<Double> getHomerunDistance() {
        return Optional.ofNullable(homerunDistance);
    }

    public Optional<Double> getLaunchSpinRate() {
        return Optional.ofNullable(launchSpinRate);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<Double> getBarreledBall() {
        return Optional.ofNullable(barreledBall);
    }

    public Optional<Double> getReleaseSpeed() {
        return Optional.ofNullable(releaseSpeed);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Double> getReleaseSpinRate() {
        return Optional.ofNullable(releaseSpinRate);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<Double> getLaunchAngle() {
        return Optional.ofNullable(launchAngle);
    }
}
