package com.fanduel.modelgenerator.generated.nflv7.seasonschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;
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
