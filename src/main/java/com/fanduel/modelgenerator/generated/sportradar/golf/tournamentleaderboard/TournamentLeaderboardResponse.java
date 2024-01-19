package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentleaderboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
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
public class TournamentLeaderboardResponse {
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

    @JsonProperty("projected_cutline")
    private Integer projectedCutline;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("leaderboard")
    private List<Leaderboard> leaderboard;

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

    public Optional<Integer> getProjectedCutline() {
        return Optional.ofNullable(projectedCutline);
    }

    public Optional<Integer> getPoints() {
        return Optional.ofNullable(points);
    }

    public List<Leaderboard> getLeaderboard() {
        return Optional.ofNullable(leaderboard).orElse(Collections.emptyList());
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
