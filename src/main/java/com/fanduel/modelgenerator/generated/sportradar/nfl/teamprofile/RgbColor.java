package com.fanduel.modelgenerator.generated.sportradar.nfl.teamprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class RgbColor {
    @JsonProperty("red")
    private Integer red;

    @JsonProperty("green")
    private Integer green;

    @JsonProperty("blue")
    private Integer blue;

    public Optional<Integer> getRed() {
        return Optional.ofNullable(red);
    }

    public Optional<Integer> getGreen() {
        return Optional.ofNullable(green);
    }

    public Optional<Integer> getBlue() {
        return Optional.ofNullable(blue);
    }
}
