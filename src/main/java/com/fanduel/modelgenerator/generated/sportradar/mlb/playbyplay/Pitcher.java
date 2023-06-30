package com.fanduel.modelgenerator.generated.sportradar.mlb.playbyplay;

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
public class Pitcher {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("pitch_x")
    private Integer pitchX;

    @JsonProperty("pitch_speed")
    private Double pitchSpeed;

    @JsonProperty("pitch_y")
    private Integer pitchY;

    @JsonProperty("pitch_type")
    private String pitchType;

    @JsonProperty("pitch_count")
    private Integer pitchCount;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("pitcher_hand")
    private String pitcherHand;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("hitter_hand")
    private String hitterHand;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("pitch_zone")
    private Integer pitchZone;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getPitchX() {
        return Optional.ofNullable(pitchX);
    }

    public Optional<Double> getPitchSpeed() {
        return Optional.ofNullable(pitchSpeed);
    }

    public Optional<Integer> getPitchY() {
        return Optional.ofNullable(pitchY);
    }

    public Optional<String> getPitchType() {
        return Optional.ofNullable(pitchType);
    }

    public Optional<Integer> getPitchCount() {
        return Optional.ofNullable(pitchCount);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getPitcherHand() {
        return Optional.ofNullable(pitcherHand);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getHitterHand() {
        return Optional.ofNullable(hitterHand);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getPitchZone() {
        return Optional.ofNullable(pitchZone);
    }
}
