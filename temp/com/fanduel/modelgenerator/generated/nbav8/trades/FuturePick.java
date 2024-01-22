package com.fanduel.modelgenerator.generated.nbav8.trades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class FuturePick {
    @JsonProperty("round")
    private String round;

    @JsonProperty("year")
    private String year;

    public Optional<String> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<String> getYear() {
        return Optional.ofNullable(year);
    }
}
