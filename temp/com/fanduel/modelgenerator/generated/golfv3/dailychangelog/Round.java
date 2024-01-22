package com.fanduel.modelgenerator.generated.golfv3.dailychangelog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
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
