package com.fanduel.modelgenerator.generated.nbav8.draftsummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Draft {
    @JsonProperty("broadcast")
    private Broadcast broadcast;

    @JsonProperty("venue")
    private Venue venue;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("league")
    private League league;

    @JsonProperty("id")
    private String id;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("status")
    private String status;

    public Optional<Broadcast> getBroadcast() {
        return Optional.ofNullable(broadcast);
    }

    public Optional<Venue> getVenue() {
        return Optional.ofNullable(venue);
    }

    public Optional<Integer> getYear() {
        return Optional.ofNullable(year);
    }

    public Optional<String> getEndDate() {
        return Optional.ofNullable(endDate);
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getStartDate() {
        return Optional.ofNullable(startDate);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
