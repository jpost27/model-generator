package com.fanduel.modelgenerator.generated.sportradar.golf.officialworldgolfranking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Setter
@Accessors(
        chain = true
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
@EqualsAndHashCode
@ToString
@Generated("fanduel-model-generator")
public class Statistics {
    @JsonProperty("events_played")
    private Integer eventsPlayed;

    @JsonProperty("points_lost")
    private Double pointsLost;

    @JsonProperty("avg_points")
    private Double avgPoints;

    @JsonProperty("points")
    private Double points;

    @JsonProperty("points_gained")
    private Double pointsGained;

    public Optional<Integer> getEventsPlayed() {
        return Optional.ofNullable(eventsPlayed);
    }

    public Optional<Double> getPointsLost() {
        return Optional.ofNullable(pointsLost);
    }

    public Optional<Double> getAvgPoints() {
        return Optional.ofNullable(avgPoints);
    }

    public Optional<Double> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Double> getPointsGained() {
        return Optional.ofNullable(pointsGained);
    }
}
