package com.fanduel.modelgenerator.generated.sportradar.mlb.seasonalpitchmetrics;

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
public class Player {
    @JsonProperty("college")
    private String college;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("birthcountry")
    private String birthcountry;

    @JsonProperty("seasons")
    private List<Season> seasons;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("birthcity")
    private String birthcity;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("weight")
    private String weight;

    @JsonProperty("bat_hand")
    private String batHand;

    @JsonProperty("team")
    private Team team;

    @JsonProperty("throw_hand")
    private String throwHand;

    @JsonProperty("primary_position")
    private String primaryPosition;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("pro_debut")
    private String proDebut;

    @JsonProperty("jersey_number")
    private String jerseyNumber;

    @JsonProperty("high_school")
    private String highSchool;

    @JsonProperty("birthstate")
    private String birthstate;

    @JsonProperty("id")
    private String id;

    @JsonProperty("position")
    private String position;

    @JsonProperty("preferred_name")
    private String preferredName;

    @JsonProperty("updated")
    private String updated;

    @JsonProperty("status")
    private String status;

    @JsonProperty("height")
    private String height;

    public Optional<String> getCollege() {
        return Optional.ofNullable(college);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getBirthcountry() {
        return Optional.ofNullable(birthcountry);
    }

    public List<Season> getSeasons() {
        return Optional.ofNullable(seasons).orElse(Collections.emptyList());
    }

    public Optional<String> getBirthdate() {
        return Optional.ofNullable(birthdate);
    }

    public Optional<String> getBirthcity() {
        return Optional.ofNullable(birthcity);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<String> getWeight() {
        return Optional.ofNullable(weight);
    }

    public Optional<String> getBatHand() {
        return Optional.ofNullable(batHand);
    }

    public Optional<Team> getTeam() {
        return Optional.ofNullable(team);
    }

    public Optional<String> getThrowHand() {
        return Optional.ofNullable(throwHand);
    }

    public Optional<String> getPrimaryPosition() {
        return Optional.ofNullable(primaryPosition);
    }

    public Optional<String> getReference() {
        return Optional.ofNullable(reference);
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getProDebut() {
        return Optional.ofNullable(proDebut);
    }

    public Optional<String> getJerseyNumber() {
        return Optional.ofNullable(jerseyNumber);
    }

    public Optional<String> getHighSchool() {
        return Optional.ofNullable(highSchool);
    }

    public Optional<String> getBirthstate() {
        return Optional.ofNullable(birthstate);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public Optional<String> getPreferredName() {
        return Optional.ofNullable(preferredName);
    }

    public Optional<String> getUpdated() {
        return Optional.ofNullable(updated);
    }

    public Optional<String> getStatus() {
        return Optional.ofNullable(status);
    }

    public Optional<String> getHeight() {
        return Optional.ofNullable(height);
    }
}
