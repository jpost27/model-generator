package com.fanduel.modelgenerator.generated.sportradar.mlb.leagueleaders;

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
public class Player {
    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("triples")
    private Integer triples;

    @JsonProperty("hr")
    private Integer hr;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("whip")
    private String whip;

    @JsonProperty("games_won")
    private Integer gamesWon;

    @JsonProperty("sb")
    private Integer sb;

    @JsonProperty("avg")
    private String avg;

    @JsonProperty("era")
    private String era;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("strikeouts")
    private Integer strikeouts;

    @JsonProperty("games_completed")
    private Integer gamesCompleted;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("h")
    private Integer h;

    @JsonProperty("games_saved")
    private Integer gamesSaved;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("games_lost")
    private Integer gamesLost;

    @JsonProperty("doubles")
    private Integer doubles;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("rbi")
    private Integer rbi;

    @JsonProperty("position")
    private String position;

    @JsonProperty("runs")
    private Integer runs;

    @JsonProperty("status")
    private String status;

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Integer> getTriples() {
        return Optional.ofNullable(triples);
    }

    public Optional<Integer> getHr() {
        return Optional.ofNullable(hr);
    }

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<String> getWhip() {
        return Optional.ofNullable(whip);
    }

    public Optional<Integer> getGamesWon() {
        return Optional.ofNullable(gamesWon);
    }

    public Optional<Integer> getSb() {
        return Optional.ofNullable(sb);
    }

    public Optional<String> getAvg() {
        return Optional.ofNullable(avg);
    }

    public Optional<String> getEra() {
        return Optional.ofNullable(era);
    }

    public Optional<Integer> getRank() {
        return Optional.ofNullable(rank);
    }

    public Optional<Integer> getStrikeouts() {
        return Optional.ofNullable(strikeouts);
    }

    public Optional<Integer> getGamesCompleted() {
        return Optional.ofNullable(gamesCompleted);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<Integer> getH() {
        return Optional.ofNullable(h);
    }

    public Optional<Integer> getGamesSaved() {
        return Optional.ofNullable(gamesSaved);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<Integer> getGamesLost() {
        return Optional.ofNullable(gamesLost);
    }

    public Optional<Integer> getDoubles() {
        return Optional.ofNullable(doubles);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<Integer> getRbi() {
        return Optional.ofNullable(rbi);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Integer> getRuns() {
        return Optional.ofNullable(runs);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }
}
