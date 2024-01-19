package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.lang.String;
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
public class Hole {
    @JsonProperty("par")
    private Integer par;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("yardage")
    private Integer yardage;

    @JsonProperty("description")
    private String description;

    public Optional<Integer> getPar() {
        return Optional.ofNullable(par);
    }

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getYardage() {
        return Optional.ofNullable(yardage);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
}
