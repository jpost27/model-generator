package com.fanduel.modelgenerator.generated.sportradar.mlb.dailyboxscore;

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
public class Rescheduled {
    @JsonProperty("reason")
    private String reason;

    @JsonProperty("from")
    private String from;

    public Optional<String> getReason() {
        return Optional.ofNullable(reason);
    }

    public Optional<String> getFrom() {
        return Optional.ofNullable(from);
    }
}
