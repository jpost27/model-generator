package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

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
public class Totals {
    @JsonProperty("statistics")
    private Statistics statistics;

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
