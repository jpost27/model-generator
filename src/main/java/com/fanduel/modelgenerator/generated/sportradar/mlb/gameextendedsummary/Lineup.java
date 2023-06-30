package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Lineup {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("inning_half")
    private String inningHalf;

    @JsonProperty("inning")
    private Integer inning;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("order")
    private Integer order;

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<String> getInningHalf() {
        return Optional.ofNullable(inningHalf);
    }

    public Optional<Integer> getInning() {
        return Optional.ofNullable(inning);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Integer> getOrder() {
        return Optional.ofNullable(order);
    }
}
