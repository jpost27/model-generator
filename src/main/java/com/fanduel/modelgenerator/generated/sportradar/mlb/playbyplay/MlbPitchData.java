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
public class MlbPitchData {
    @JsonProperty("code")
    private String code;

    @JsonProperty("zone")
    private Integer zone;

    @JsonProperty("coordinates")
    private Coordinates coordinates;

    @JsonProperty("description")
    private String description;

    @JsonProperty("strike_zone_top")
    private Double strikeZoneTop;

    @JsonProperty("strike_zone_bottom")
    private Double strikeZoneBottom;

    @JsonProperty("speed")
    private Double speed;

    public Optional<String> getCode() {
        return Optional.ofNullable(code);
    }

    public Optional<Integer> getZone() {
        return Optional.ofNullable(zone);
    }

    public Optional<Coordinates> getCoordinates() {
        return Optional.ofNullable(coordinates);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Double> getStrikeZoneTop() {
        return Optional.ofNullable(strikeZoneTop);
    }

    public Optional<Double> getStrikeZoneBottom() {
        return Optional.ofNullable(strikeZoneBottom);
    }

    public Optional<Double> getSpeed() {
        return Optional.ofNullable(speed);
    }
}
