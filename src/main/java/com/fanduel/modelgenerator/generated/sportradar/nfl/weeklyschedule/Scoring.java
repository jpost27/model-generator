package com.fanduel.modelgenerator.generated.sportradar.nfl.weeklyschedule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Accessors(
        chain = true
)
@Generated("fanduel-model-generator")
public class Scoring {
    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("periods")
    private List<Period> periods;

    @JsonProperty("home_points")
    private Integer homePoints;

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public List<Period> getPeriods() {
        return Optional.ofNullable(periods).orElse(Collections.emptyList());
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }
}
