package com.fanduel.modelgenerator.generated.sportradar.nba.seriesstatistics;

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
public class SeriesStatisticsResponse {
    @JsonProperty("players")
    private List<Player> players;

    @JsonProperty("own_record")
    private OwnRecord ownRecord;

    @JsonProperty("opponents")
    private Opponents opponents;

    @JsonProperty("season")
    private Season season;

    @JsonProperty("id")
    private String id;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("title")
    private String title;

    @JsonProperty("status")
    private String status;

    public List<Player> getPlayers() {
        return Optional.ofNullable(players).orElse(Collections.emptyList());
    }

    public Optional<OwnRecord> getOwnRecord() {
        return Optional.ofNullable(ownRecord);
    }

    public Optional<Opponents> getOpponents() {
        return Optional.ofNullable(opponents);
    }

    public Optional<Season> getSeason() {
        return Optional.ofNullable(season);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
