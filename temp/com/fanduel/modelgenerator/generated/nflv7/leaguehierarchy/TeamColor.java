package com.fanduel.modelgenerator.generated.nflv7.leaguehierarchy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class TeamColor {
    @JsonProperty("rgb_color")
    private RgbColor rgbColor;

    @JsonProperty("hex_color")
    private String hexColor;

    @JsonProperty("alpha")
    private Double alpha;

    @JsonProperty("type")
    private String type;

    public Optional<RgbColor> getRgbColor() {
        return Optional.ofNullable(rgbColor);
    }

    public Optional<String> getHexColor() {
        return Optional.ofNullable(hexColor);
    }

    public Optional<Double> getAlpha() {
        return Optional.ofNullable(alpha);
    }

    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }
}
