package com.fanduel.modelgenerator.generated.nflv7.topprospects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
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
public class Prospect {
    @JsonProperty("source_id")
    private String sourceId;

    @JsonProperty("team_name")
    private String teamName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("top_prospect")
    private Boolean topProspect;

    @JsonProperty("conference")
    private Conference conference;

    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("division")
    private Division division;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("league_id")
    private String leagueId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("height")
    private Integer height;

    public Optional<String> getSourceId() {
        return Optional.ofNullable(sourceId);
    }

    public Optional<String> getTeamName() {
        return Optional.ofNullable(teamName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<Boolean> getTopProspect() {
        return Optional.ofNullable(topProspect);
    }

    public Optional<Conference> getConference() {
        return Optional.ofNullable(conference);
    }

    public Optional<Integer> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getExperience() {
        return Optional.ofNullable(experience);
    }

    public Optional<Division> getDivision() {
        return Optional.ofNullable(division);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getBirthPlace() {
        return Optional.ofNullable(birthPlace);
    }

    public Optional<String> getLeagueId() {
        return Optional.ofNullable(leagueId);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<Integer> getHeight() {
        return Optional.ofNullable(height);
    }
}
