package com.fanduel.modelgenerator.generated.sportradar.nba.gamesummary;

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
public class MostUnanswered {
    @JsonProperty("own_score")
    private Integer ownScore;

    @JsonProperty("opp_score")
    private Integer oppScore;

    @JsonProperty("points")
    private Integer points;

    public Optional<Integer> getOwnScore() {
        return Optional.ofNullable(ownScore);
    }

    public Optional<Integer> getOppScore() {
        return Optional.ofNullable(oppScore);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
