package com.fanduel.modelgenerator.generated.manual.NfNflPlayerStatlines.nfnflplayerstatlines;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
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
public class Player {
    @JsonProperty("fppg")
    private Double fppg;

    @JsonProperty("games_played")
    private Integer gamesPlayed;

    @JsonProperty("team_id")
    private Integer teamId;

    @JsonProperty("sport_radar_player_id")
    private String sportRadarPlayerId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("team")
    private String team;

    @JsonProperty("salary")
    private Object salary;

    @JsonProperty("fppg_last_2_games")
    private Double fppgLast2Games;

    @JsonProperty("sport_radar_team_id")
    private String sportRadarTeamId;

    public Optional<Double> getFppg() {
        return Optional.ofNullable(fppg);
    }

    public Optional<Integer> getGamesPlayed() {
        return Optional.ofNullable(gamesPlayed);
    }

    public Optional<Integer> getTeamId() {
        return Optional.ofNullable(teamId);
    }

    public Optional<String> getSportRadarPlayerId() {
        return Optional.ofNullable(sportRadarPlayerId);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<Object> getSalary() {
        return Optional.ofNullable(salary);
    }

    public Optional<Double> getFppgLast2Games() {
        return Optional.ofNullable(fppgLast2Games);
    }

    public Optional<String> getSportRadarTeamId() {
        return Optional.ofNullable(sportRadarTeamId);
    }
}
