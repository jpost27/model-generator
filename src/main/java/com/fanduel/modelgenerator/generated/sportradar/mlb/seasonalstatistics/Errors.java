package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

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
public class Errors {
    @JsonProperty("throwing")
    private Integer throwing;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("fielding")
    private Integer fielding;

    @JsonProperty("interference")
    private Integer interference;

    public Optional<Integer> getThrowing() {
        return Optional.ofNullable(throwing);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Integer> getFielding() {
        return Optional.ofNullable(fielding);
    }

    public Optional<Integer> getInterference() {
        return Optional.ofNullable(interference);
    }
}
