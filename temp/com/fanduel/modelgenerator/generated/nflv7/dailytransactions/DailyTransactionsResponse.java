package com.fanduel.modelgenerator.generated.nflv7.dailytransactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class DailyTransactionsResponse {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("league")
    private League league;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("_comment")
    private String comment;

    @JsonProperty("end_time")
    private String endTime;

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getStartTime() {
        return Optional.ofNullable(startTime);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    public Optional<String> getEndTime() {
        return Optional.ofNullable(endTime);
    }
}