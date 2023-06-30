package com.fanduel.modelgenerator.generated.sportradar.ncaafb.seasonalstatistics;

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
public class Interceptions {
    @JsonProperty("return_yards")
    private Integer returnYards;

    @JsonProperty("returned")
    private Integer returned;

    @JsonProperty("interceptions")
    private Integer interceptions;

    public Optional<Integer> getReturnYards() {
        return Optional.ofNullable(returnYards);
    }

    public Optional<Integer> getReturned() {
        return Optional.ofNullable(returned);
    }

    public Optional<Integer> getInterceptions() {
        return Optional.ofNullable(interceptions);
    }
}
