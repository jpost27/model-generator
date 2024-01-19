package com.fanduel.modelgenerator.generated.sportradar.golf.tournamentschedule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
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
public class Tournament {
    @JsonProperty("course_timezone")
    private String courseTimezone;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("total_rounds")
    private Integer totalRounds;

    @JsonProperty("winning_share")
    private Double winningShare;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("projected_cutline")
    private Integer projectedCutline;

    @JsonProperty("points")
    private Integer points;

    @JsonProperty("network")
    private String network;

    @JsonProperty("cutline")
    private Integer cutline;

    @JsonProperty("winner")
    private Winner winner;

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

    @JsonProperty("defending_champ")
    private DefendingChamp defendingChamp;

    @JsonProperty("status")
    private String status;

    public Optional<String> getCourseTimezone() {
        return Optional.ofNullable(courseTimezone);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<String> getEndDate() {
        return Optional.ofNullable(endDate);
    }

    public Optional<Integer> getTotalRounds() {
        return Optional.ofNullable(totalRounds);
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

    public Optional<String> getNetwork() {
        return Optional.ofNullable(network);
    }

    public Optional<Integer> getCutline() {
        return Optional.ofNullable(cutline);
    }

    public Optional<Winner> getWinner() {
        return Optional.ofNullable(winner);
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

    public Optional<DefendingChamp> getDefendingChamp() {
        return Optional.ofNullable(defendingChamp);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
