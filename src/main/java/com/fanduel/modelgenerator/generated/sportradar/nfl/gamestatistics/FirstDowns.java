package com.fanduel.modelgenerator.generated.sportradar.nfl.gamestatistics;

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
public class FirstDowns {
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("pass")
    private Integer pass;

    @JsonProperty("penalty")
    private Integer penalty;

    @JsonProperty("rush")
    private Integer rush;

    public Optional<Integer> getTotal() {
        return Optional.ofNullable(total);
    }

    public Optional<Integer> getPass() {
        return Optional.ofNullable(pass);
    }

    public Optional<Integer> getPenalty() {
        return Optional.ofNullable(penalty);
    }

    public Optional<Integer> getRush() {
        return Optional.ofNullable(rush);
    }
}
