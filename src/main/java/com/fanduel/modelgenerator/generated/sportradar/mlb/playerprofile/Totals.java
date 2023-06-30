package com.fanduel.modelgenerator.generated.sportradar.mlb.playerprofile;

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
    @JsonProperty("statcast_metrics")
    private StatcastMetrics statcastMetrics;

    @JsonProperty("splits")
    private Splits splits;

    @JsonProperty("statistics")
    private Statistics statistics;

    public Optional<StatcastMetrics> getStatcastMetrics() {
        return Optional.ofNullable(statcastMetrics);
    }

    public Optional<Splits> getSplits() {
        return Optional.ofNullable(splits);
    }

    public Optional<Statistics> getStatistics() {
        return Optional.ofNullable(statistics);
    }
}
