package com.fanduel.modelgenerator.generated.sportradar.mlb.seriesstatistics;

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
public class Assists {
    @JsonProperty("outfield")
    private Integer outfield;

    @JsonProperty("total")
    private Integer total;

    public Optional<Integer> getOutfield() {
        return Optional.ofNullable(outfield);
    }

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }
}
