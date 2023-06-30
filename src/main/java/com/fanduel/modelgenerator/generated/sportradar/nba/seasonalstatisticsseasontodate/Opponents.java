package com.fanduel.modelgenerator.generated.sportradar.nba.seasonalstatisticsseasontodate;

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
public class Opponents {
    @JsonProperty("average")
    private Average average;

    @JsonProperty("total")
    private Total total;

    public Optional<Average> getAverage() {
        return Optional.ofNullable(average);
    }

    public Optional<Total> getTotal() {
        return Optional.ofNullable(total);
    }
}
