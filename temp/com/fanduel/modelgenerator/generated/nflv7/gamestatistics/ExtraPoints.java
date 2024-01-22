package com.fanduel.modelgenerator.generated.nflv7.gamestatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ExtraPoints {
    @JsonProperty("conversions")
    private Conversions conversions;

    @JsonProperty("kicks")
    private Kicks kicks;

    public Optional<Conversions> getConversions() {
        return Optional.ofNullable(conversions);
    }

    public Optional<Kicks> getKicks() {
        return Optional.ofNullable(kicks);
    }
}
