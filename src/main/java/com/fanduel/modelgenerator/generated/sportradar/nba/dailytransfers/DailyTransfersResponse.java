package com.fanduel.modelgenerator.generated.sportradar.nba.dailytransfers;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class DailyTransfersResponse {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("league")
    private League league;

    @JsonProperty("start_time")
    private String startTime;

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

    public Optional<String> getEndTime() {
        return Optional.ofNullable(endTime);
    }
}
