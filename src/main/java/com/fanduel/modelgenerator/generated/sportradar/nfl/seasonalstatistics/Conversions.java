package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

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
public class Conversions {
    @JsonProperty("defense_attempts")
    private Integer defenseAttempts;

    @JsonProperty("pass_successes")
    private Integer passSuccesses;

    @JsonProperty("pass_attempts")
    private Integer passAttempts;

    @JsonProperty("rush_successes")
    private Integer rushSuccesses;

    @JsonProperty("receive_successes")
    private Integer receiveSuccesses;

    @JsonProperty("receive_attempts")
    private Integer receiveAttempts;

    @JsonProperty("defense_successes")
    private Integer defenseSuccesses;

    @JsonProperty("turnover_successes")
    private Integer turnoverSuccesses;

    @JsonProperty("rush_attempts")
    private Integer rushAttempts;

    public Optional<Integer> getDefenseAttempts() {
        return Optional.ofNullable(defenseAttempts);
    }

    public Optional<Integer> getPassSuccesses() {
        return Optional.ofNullable(passSuccesses);
    }

    public Optional<Integer> getPassAttempts() {
        return Optional.ofNullable(passAttempts);
    }

    public Optional<Integer> getRushSuccesses() {
        return Optional.ofNullable(rushSuccesses);
    }

    public Optional<Integer> getReceiveSuccesses() {
        return Optional.ofNullable(receiveSuccesses);
    }

    public Optional<Integer> getReceiveAttempts() {
        return Optional.ofNullable(receiveAttempts);
    }

    public Optional<Integer> getDefenseSuccesses() {
        return Optional.ofNullable(defenseSuccesses);
    }

    public Optional<Integer> getTurnoverSuccesses() {
        return Optional.ofNullable(turnoverSuccesses);
    }

    public Optional<Integer> getRushAttempts() {
        return Optional.ofNullable(rushAttempts);
    }
}
