package com.fanduel.modelgenerator.generated.sportradar.mlb.gameextendedsummary;

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
public class Count {
    @JsonProperty("outs")
    private Integer outs;

    @JsonProperty("balls")
    private Integer balls;

    @JsonProperty("strikes")
    private Integer strikes;

    @JsonProperty("pitch_count")
    private Integer pitchCount;

    public Optional<Integer> getOuts() {
        return Optional.ofNullable(outs);
    }

    public Optional<Integer> getBalls() {
        return Optional.ofNullable(balls);
    }

    public Optional<Integer> getStrikes() {
        return Optional.ofNullable(strikes);
    }

    public Optional<Integer> getPitchCount() {
        return Optional.ofNullable(pitchCount);
    }
}
