package com.fanduel.modelgenerator.generated.sportradar.nfl.seasonalstatistics;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import javax.annotation.processing.Generated;
import lombok.Data;

@Data
@Generated("model-generator")
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
}
