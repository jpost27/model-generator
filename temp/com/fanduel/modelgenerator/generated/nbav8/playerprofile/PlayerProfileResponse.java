package com.fanduel.modelgenerator.generated.nbav8.playerprofile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class PlayerProfileResponse {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("abbr_name")
    private String abbrName;

    @JsonProperty("league")
    private League league;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("weight")
    private Integer weight;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("sr_id")
    private String srId;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("rookie_year")
    private Integer rookieYear;

    @JsonProperty("draft")
    private Draft draft;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("status")
    private String status;

    @JsonProperty("height")
    private Integer height;

    public Optional<String> getCollege() {
        return Optional.ofNullable(college);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public List<Season> getSeasons() {
        return Optional.ofNullable(seasons).orElse(Collections.emptyList());
    }

    public Optional<String> getBirthdate() {
        return Optional.ofNullable(birthdate);
    }

    public Optional<String> getAbbrName() {
        return Optional.ofNullable(abbrName);
    }

    public Optional<League> getLeague() {
        return Optional.ofNullable(league);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
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

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<String> getSrId() {
        return Optional.ofNullable(srId);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getBirthPlace() {
        return Optional.ofNullable(birthPlace);
    }

    public Optional<Integer> getRookieYear() {
        return Optional.ofNullable(rookieYear);
    }

    public Optional<Draft> getDraft() {
        return Optional.ofNullable(draft);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getHighSchool() {
        return Optional.ofNullable(highSchool);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getUpdated() {
        return Optional.ofNullable(updated);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<Integer> getHeight() {
        return Optional.ofNullable(height);
    }
}
