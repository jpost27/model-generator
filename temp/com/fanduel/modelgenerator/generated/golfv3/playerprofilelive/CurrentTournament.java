package com.fanduel.modelgenerator.generated.golfv3.playerprofilelive;

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
public class CurrentTournament {
    @JsonProperty("course_timezone")
    private String courseTimezone;

    @JsonProperty("coverage")
    private String coverage;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("leaderboard")
    private Leaderboard leaderboard;

    @JsonProperty("cutline")
    private Integer cutline;

    @JsonProperty("name")
    private String name;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("id")
    private String id;

    @JsonProperty("cut_round")
    private Integer cutRound;

    @JsonProperty("scoring_system")
    private String scoringSystem;

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

    public Optional<String> getEventType() {
        return Optional.ofNullable(eventType);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public Optional<Leaderboard> getLeaderboard() {
        return Optional.ofNullable(leaderboard);
    }

    public Optional<Integer> getCutline() {
        return Optional.ofNullable(cutline);
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

    public Optional<Integer> getCutRound() {
        return Optional.ofNullable(cutRound);
    }

    public Optional<String> getScoringSystem() {
        return Optional.ofNullable(scoringSystem);
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
