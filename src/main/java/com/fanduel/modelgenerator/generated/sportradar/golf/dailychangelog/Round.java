package com.fanduel.modelgenerator.generated.sportradar.golf.dailychangelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Round {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private String status;

    @JsonProperty("pairings")
    private List<Pairing> pairings;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public List<Pairing> getPairings() {
        return Optional.ofNullable(pairings).orElse(Collections.emptyList());
    }
}
