package com.fanduel.modelgenerator.generated.sportradar.mlb.gamesummary;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Official {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("assignment")
    private String assignment;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("id")
    private String id;

    @JsonProperty("experience")
    private String experience;

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public Optional<String> getAssignment() {
        return Optional.ofNullable(assignment);
    }

    public Optional<String> getFullName() {
        return Optional.ofNullable(fullName);
    }

    public Optional<String> getId() {
        return Optional.ofNullable(id);
    }

    public Optional<String> getExperience() {
        return Optional.ofNullable(experience);
    }
}
