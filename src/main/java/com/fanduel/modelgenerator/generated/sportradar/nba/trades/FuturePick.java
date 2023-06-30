package com.fanduel.modelgenerator.generated.sportradar.nba.trades;

import com.fasterxml.jackson.annotation.JsonProperty;
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
