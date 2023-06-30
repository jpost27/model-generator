package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalsplits;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Splits {
    @JsonProperty("pitching")
    private Pitching pitching;

    @JsonProperty("hitting")
    private Hitting hitting;

    public Optional<Pitching> getPitching() {
        return Optional.ofNullable(pitching);
    }

    public Optional<Hitting> getHitting() {
        return Optional.ofNullable(hitting);
    }
}
