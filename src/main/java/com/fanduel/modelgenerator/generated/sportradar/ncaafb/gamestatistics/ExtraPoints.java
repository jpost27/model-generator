package com.fanduel.modelgenerator.generated.sportradar.ncaafb.gamestatistics;

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
