package com.fanduel.modelgenerator.generated.sportradar.ncaafb.playbyplay;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
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
public class Score {
    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("points-after-play")
    private PointsAfterPlay pointsAfterPlay;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("clock")
    private String clock;

    @JsonProperty("points")
    private Integer points;

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<PointsAfterPlay> getPointsAfterPlay() {
        return Optional.ofNullable(pointsAfterPlay);
    }

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<String> getClock() {
        return Optional.ofNullable(clock);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }
}
