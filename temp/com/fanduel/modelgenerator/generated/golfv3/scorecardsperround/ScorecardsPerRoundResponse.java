package com.fanduel.modelgenerator.generated.golfv3.scorecardsperround;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
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
public class ScorecardsPerRoundResponse {
    @JsonProperty("course_timezone")
    private String courseTimezone;

    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("winning_share")
    private Double winningShare;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("round")
    private Round round;

    @JsonProperty("name")
    private String name;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("id")
    private String id;

    @JsonProperty("purse")
    private Double purse;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;

    public Optional<String> getCourseTimezone() {
        return Optional.ofNullable(courseTimezone);
    }

    public Optional<String> getCoverage() {
        return Optional.ofNullable(coverage);
    }

    public List<Season> getSeasons() {
        return Optional.ofNullable(seasons).orElse(Collections.emptyList());
    }

    public Optional<String> getEndDate() {
        return Optional.ofNullable(endDate);
    }

    public Optional<Double> getWinningShare() {
        return Optional.ofNullable(winningShare);
    }

    public Optional<String> getEventType() {
        return Optional.ofNullable(eventType);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Round> getRound() {
        return Optional.ofNullable(round);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getCurrency() {
        return Optional.ofNullable(currency);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Double> getPurse() {
        return Optional.ofNullable(purse);
    }

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
