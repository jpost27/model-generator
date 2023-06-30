package com.fanduel.modelgenerator.generated.sportradar.ncaafb.weeklyschedule;

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
public class Period {
    @JsonProperty("number")
    private Integer number;

    @JsonProperty("sequence")
    private Integer sequence;

    @JsonProperty("period_type")
    private String periodType;

    @JsonProperty("away_points")
    private Integer awayPoints;

    @JsonProperty("home_points")
    private Integer homePoints;

    @JsonProperty("id")
    private String id;

    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }

    public Optional<Integer> getSequence() {
        return Optional.ofNullable(sequence);
    }

    public Optional<String> getPeriodType() {
        return Optional.ofNullable(periodType);
    }

    public Optional<Integer> getAwayPoints() {
        return Optional.ofNullable(awayPoints);
    }

    public Optional<Integer> getHomePoints() {
        return Optional.ofNullable(homePoints);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }
}
