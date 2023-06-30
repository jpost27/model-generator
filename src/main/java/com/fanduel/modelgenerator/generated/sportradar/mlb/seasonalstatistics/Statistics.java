package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalstatistics;

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
public class Statistics {
    @JsonProperty("fielding")
    private Fielding fielding;

    @JsonProperty("pitching")
    private Pitching pitching;

    @JsonProperty("hitting")
    private Hitting hitting;

    public Optional<Fielding> getFielding() {
        return Optional.ofNullable(fielding);
    }

    public Optional<Pitching> getPitching() {
        return Optional.ofNullable(pitching);
    }

    public Optional<Hitting> getHitting() {
        return Optional.ofNullable(hitting);
    }
}
