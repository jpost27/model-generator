package com.fanduel.modelgenerator.generated.nbav8.teamprofilerosters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
